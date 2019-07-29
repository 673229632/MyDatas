package jp.co.fujixerox.dmz.bean;

import java.io.Serializable;

// scheme:[//[user[:password]@]host[:port]][/path][?query][#fragment]
public class RequestBean implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = -770313373369152504L;
	
	private String objectId;
	
	private String method;
	
	private String scheme;
	
	private String host;
	
	private Integer port;
	
	private byte[] uri;
	
	private boolean isKeepAlive;
	
	private String charset;
	
	private byte[] content;
	
	private byte[] headers;

	public String getObjectId() {
		return objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public byte[] getUri() {
		return uri;
	}

	public void setUri(byte[] uri) {
		this.uri = uri;
	}

	public boolean isKeepAlive() {
		return isKeepAlive;
	}

	public void setKeepAlive(boolean isKeepAlive) {
		this.isKeepAlive = isKeepAlive;
	}

	public String getCharset() {
		return charset;
	}

	public void setCharset(String charset) {
		this.charset = charset;
	}

	public String getScheme() {
		return scheme;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public byte[] getHeaders() {
		return headers;
	}

	public void setHeaders(byte[] headers) {
		this.headers = headers;
	}

	public byte[] getContent() {
		return content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}
}
