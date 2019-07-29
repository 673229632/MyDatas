package jp.co.fujixerox.dmz.bean;

import java.util.List;

public class TrustedSiteBean {

	private final String host;

	private final List<String> portList;

	public TrustedSiteBean(String host, List<String> portList) {
		super();
		this.host = host;
		this.portList = portList;
	}

	public String getHost() {
		return host;
	}

	public List<String> getPortList() {
		return portList;
	}

}
