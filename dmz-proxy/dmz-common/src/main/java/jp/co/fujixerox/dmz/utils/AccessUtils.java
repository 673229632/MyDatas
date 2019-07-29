package jp.co.fujixerox.dmz.utils;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import jp.co.fujixerox.dmz.bean.RequestBean;
import jp.co.fujixerox.dmz.bean.TrustedSiteBean;

public class AccessUtils {

	/**
	 * just by TrustedSites, stop unsafe request
	 * 
	 * @param requestBean
	 * @return
	 * @throws Exception
	 */
	public static boolean isAllowAccess(RequestBean requestBean) {

		String host = requestBean.getHost().toUpperCase();
		Map<String, TrustedSiteBean> trustedSiteMap = XmlUtils.readTrustedSites();
		if (trustedSiteMap.containsKey(host)) {
			TrustedSiteBean trustedSiteBean = trustedSiteMap.get(host);
			List<String> portList = trustedSiteBean.getPortList();
			if (portList != null && !portList.isEmpty()) {
				return portList.contains(requestBean.getPort().toString());
			}
			return true;
		}
		for (Entry<String, TrustedSiteBean> entry : trustedSiteMap.entrySet()) {
			String key = entry.getKey();
			if (key.contains("*")||key.contains("?")) {
				return match(key, host);
			}
		}
		return false;
	}
	
	
	public static boolean match(String pattern, String str) {
		if (pattern == null || str == null)
			return false;

		boolean result = false;
		char c; // 当前要匹配的字符串
		boolean beforeStar = false; // 是否遇到通配符*
		int back_i = 0;// 回溯,当遇到通配符时,匹配不成功则回溯
		int back_j = 0;
		int i, j;
		for (i = 0, j = 0; i < str.length();) {
			if (pattern.length() <= j) {
				if (back_i != 0) {// 有通配符,但是匹配未成功,回溯
					beforeStar = true;
					i = back_i;
					j = back_j;
					back_i = 0;
					back_j = 0;
					continue;
				}
				break;
			}

			if ((c = pattern.charAt(j)) == '*') {
				if (j == pattern.length() - 1) {// 通配符已经在末尾,返回true
					result = true;
					break;
				}
				beforeStar = true;
				j++;
				continue;
			}

			if (beforeStar) {
				if (str.charAt(i) == c) {
					beforeStar = false;
					back_i = i + 1;
					back_j = j;
					j++;
				}
			} else {
				if (c != '?' && c != str.charAt(i)) {
					result = false;
					if (back_i != 0) {// 有通配符,但是匹配未成功,回溯
						beforeStar = true;
						i = back_i;
						j = back_j;
						back_i = 0;
						back_j = 0;
						continue;
					}
					break;
				}
				j++;
			}
			i++;
		}

		if (i == str.length() && j == pattern.length())// 全部遍历完毕
			result = true;
		return result;
	}
}
