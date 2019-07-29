package jp.co.fujixerox.dmz.utils;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;

import jp.co.fujixerox.dmz.bean.RequestBean;
import jp.co.fujixerox.dmz.bean.ResponseBean;
import jp.co.fujixerox.dmz.log.DMZLLogFactory;
import jp.co.fujixerox.dmz.log.DMZLog;
import net.sf.json.JSONObject;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultRedirectStrategy;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.HttpContext;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.TrustStrategy;
import org.apache.http.util.EntityUtils;

public class DMZClientUtils {
	static {
		System.setProperty("http.proxyHost", System.getenv("http.proxyHost"));
		System.setProperty("http.proxyPort", System.getenv("http.proxyPort"));
		System.setProperty("http.nonProxyHosts",
				System.getenv("http.nonProxyHosts"));
	}
	private static DMZLog LOG = DMZLLogFactory.getSystemLog();
	private static final Integer TIMEOUT = Integer.parseInt(PropertiesUtils
			.getPropertys().getProperty("TIMEOUT"));

	/**
	 * execute request from DMZ-server, convert response to binary data
	 * 
	 * @param frame
	 *            :Web Socket frame containing binary data
	 * @return response binary data
	 * @throws Exception
	 */
	public static ByteBuf getHttpResponse(BinaryWebSocketFrame frame)
			throws Exception {
		return convert(getHttpResponseBean(frame));
	}

	/**
	 * execute request from DMZ-server
	 * 
	 * @param frame
	 *            : Socket frame containing binary data
	 * @return response bean
	 * @throws Exception
	 */
	private static ResponseBean getHttpResponseBean(BinaryWebSocketFrame frame)
			throws Exception {
		SSLConnectionSocketFactory allBelieveFactory = createAllBelieveSslConnectionSocketFactory();
		RequestConfig config = RequestConfig.custom().setSocketTimeout(TIMEOUT)
				.build();
		CloseableHttpClient httpclient = HttpClients
				.custom()
				.setRedirectStrategy(new DefaultRedirectStrategy() {
					public boolean isRedirected(HttpRequest request,
							HttpResponse response, HttpContext context) {
						// boolean isRedirect = false;
						// try {
						// isRedirect = super.isRedirected(request, response,
						// context);
						// } catch (ProtocolException e) {
						// e.printStackTrace();
						// }
						// if (!isRedirect) {
						// int responseCode = response.getStatusLine()
						// .getStatusCode();
						// if (responseCode == 301 || responseCode == 302) {
						// return true;
						// }
						// }
						return false;
					}
				}).setSSLSocketFactory(allBelieveFactory)
				.setDefaultRequestConfig(config).useSystemProperties().build();
		String getReq = new String(ByteBufUtil.getBytes(frame.content()),
				"UTF-8");
		JSONObject json = JSONObject.fromObject(getReq);
		RequestBean requestBean = (RequestBean) JSONObject.toBean(json,
				RequestBean.class);
		ResponseBean responseBean = new ResponseBean();

		try {
			if (!AccessUtils.isAllowAccess(requestBean)) {
				BeanUtils.copyProperties(responseBean, requestBean);
				responseBean.setStatusCode(403);
				return responseBean;
			}

			// get url
			String url = DMZUtil.getRealURL(requestBean);
			LOG.info(requestBean.getMethod() + " " + url);

			// get Headers
			Header[] headers = (Header[]) SeriallizeUtil.toObject(requestBean
					.getHeaders());
			for (Header header : headers) {
				LOG.debug(header.toString());
			}

			// execute request
			CloseableHttpResponse response = null;
			if (HttpMethod.GET.name().equals(requestBean.getMethod())) {
				HttpGet httpget = new HttpGet(url);
				httpget.setHeaders(headers);
				response = httpclient.execute(httpget);

			} else if (HttpMethod.POST.name().equals(requestBean.getMethod())) {
				HttpPost httppost = new HttpPost(url);
				httppost.setHeaders(headers);
				if (requestBean.getContent() != null
						&& requestBean.getContent().length != 0) {
					httppost.setEntity(new ByteArrayEntity(Base64
							.decodeBase64(requestBean.getContent())));
				}

				response = httpclient.execute(httppost);
			}
			LOG.info("Response for:" + url + " "
					+ response.getStatusLine().toString());

			// set response
			if (null != response) {
				LOG.debug(response.toString());

				BeanUtils.copyProperties(responseBean, requestBean);
				responseBean.setHeaders(SeriallizeUtil.toByteArray(response
						.getAllHeaders()));
				HttpEntity entity = response.getEntity();
				if (entity != null) {
					// rb.setResContent(EntityUtils.toString(entity, "utf-8"));
					responseBean.setContent(EntityUtils.toByteArray(entity));
				}
				responseBean.setStatusCode(response.getStatusLine()
						.getStatusCode());
			}
			return responseBean;
		} catch (Exception e) {
			BeanUtils.copyProperties(responseBean, requestBean);
			responseBean.setContent(e.getMessage().getBytes());
			responseBean.setStatusCode(500);
			return responseBean;
		} finally {
			httpclient.close();
		}
	}

	private static SSLConnectionSocketFactory createAllBelieveSslConnectionSocketFactory()
			throws KeyManagementException, NoSuchAlgorithmException,
			KeyStoreException {
		SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null,
				new TrustStrategy() {

					@Override
					public boolean isTrusted(X509Certificate[] chain,
							String authType) throws CertificateException {
						return true;
					}
				}).build();

		SSLConnectionSocketFactory allBelieveFactory = new SSLConnectionSocketFactory(
				sslContext, new HostnameVerifier() {

					@Override
					public boolean verify(String arg0, SSLSession arg1) {
						return true;
					}
				});
		return allBelieveFactory;
	}

	/**
	 * convert response bean to binary data
	 * 
	 * @param response
	 *            bean
	 * @return response binary data
	 */
	private static ByteBuf convert(ResponseBean rb) {
		ByteBuf binaryData = Unpooled.buffer();
		JSONObject jsonRes = JSONObject.fromObject(rb);
		binaryData.writeBytes(jsonRes.toString().getBytes());
		return binaryData;
	}
}
