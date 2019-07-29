package jp.co.fujixerox.dmz.utils;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;

import java.io.UnsupportedEncodingException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import jp.co.fujixerox.dmz.bean.RequestBean;
import jp.co.fujixerox.dmz.bean.ResponseBean;
import net.sf.json.JSONObject;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.StringUtils;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

import com.google.common.net.HostAndPort;

public class DMZServerUtils {

	public static RequestBean getHttpRequset(ChannelHandlerContext ctx, FullHttpRequest req) throws URISyntaxException {
		RequestBean rb = getHttpRequset(req);
		Integer port = rb.getPort();
		if (port == -1) {
			InetSocketAddress addr = (InetSocketAddress) ctx.channel().localAddress();
			rb.setPort(addr.getPort());
		}
		if (StringUtils.isBlank(rb.getScheme())) {
			rb.setScheme(rb.getPort() == 443 ? "https" : "http");
		}

		return rb;
	}

	public static RequestBean getHttpRequset(FullHttpRequest req) throws URISyntaxException {
		RequestBean rb = new RequestBean();
		URI uri = new URI(req.uri());
		rb.setScheme(uri.getScheme());
		HostAndPort hostAndPort = HostAndPort.fromString(req.headers().get(HttpHeaderNames.HOST));
		rb.setHost(hostAndPort.getHost());
		rb.setPort(uri.getPort());
		rb.setObjectId(generateUUID());
		rb.setMethod(req.method().name());
		rb.setUri(req.uri().getBytes(Charset.forName("UTF-8")));
		if (req.headers().get(HttpHeaderNames.CONNECTION) == null
				|| !req.headers().get(HttpHeaderNames.CONNECTION).equals("keep-alive")) {
			rb.setKeepAlive(false);
		} else {
			rb.setKeepAlive(true);
		}

		HttpHeaders httpHeaders = req.headers();
		rb.setHeaders(SeriallizeUtil.toByteArray(getHeaders(httpHeaders)));
		rb.setContent(Base64.encodeBase64(ByteBufUtil.getBytes(req.content())));
		return rb;
	}
	
	private static Header[] getHeaders(HttpHeaders headers) {
		List<Header> headerList = new ArrayList<>();
		Header[] res = new Header[headerList.size()];
		for (Map.Entry<String, String> header : headers.entries()) {
			if (!"Host".equalsIgnoreCase(header.getKey().toString())
                    && !"Content-Length".equalsIgnoreCase(header.getKey().toString())) {
				headerList.add(new BasicHeader(header.getKey(), header.getValue()));
			}
		}
		return headerList.toArray(res);
	}

	public static ByteBuf Convert(RequestBean rb) {
		ByteBuf binaryData = Unpooled.buffer();
		JSONObject jsonObject = JSONObject.fromObject(rb);
		binaryData.writeBytes(jsonObject.toString().getBytes());
		return binaryData;
	}

	public static ResponseBean getHttpResponse(BinaryWebSocketFrame frame) throws UnsupportedEncodingException {
		String getReq = new String(ByteBufUtil.getBytes(frame.content()), "UTF-8");
		JSONObject json = JSONObject.fromObject(getReq);
		ResponseBean bean = (ResponseBean) JSONObject.toBean(json, ResponseBean.class);
		return bean;
	}

	private static String generateUUID() {
		String uuid = UUID.randomUUID().toString();
		return uuid.replace("-", "");
	}
}
