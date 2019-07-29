package jp.co.fujixerox.dmz.utils;

import io.netty.util.internal.StringUtil;

import java.net.URI;
import java.nio.charset.Charset;

import jp.co.fujixerox.dmz.bean.RequestBean;

public class DMZUtil {
	public static String getRealURL(RequestBean requestBean) {
		URI uri = null;
		try {
			uri = new URI(new String(requestBean.getUri(),
					Charset.forName("UTF-8")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String prefix = requestBean.getScheme() + "://"
				+ requestBean.getHost() + ":"
				+ requestBean.getPort();
		if (requestBean.getPort() == 80 || requestBean.getPort() == 443) {
			prefix = requestBean.getScheme() + "://"
					+ requestBean.getHost();
		}

		String url = prefix + "/" + new String(requestBean.getUri(), Charset.forName("UTF-8"));
		if (uri != null ) {
			if (StringUtil.isNullOrEmpty(uri.getScheme())) {
				url = prefix + uri.toString();
			} else {
				url = uri.toString();
			}
		}

		return url;
	}
}
