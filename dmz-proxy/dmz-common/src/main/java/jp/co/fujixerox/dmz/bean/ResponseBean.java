package jp.co.fujixerox.dmz.bean;

import java.io.Serializable;

public class ResponseBean extends RequestBean implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = 5688016316230632506L;
	
	public Integer statusCode;

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
}
