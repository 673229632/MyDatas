package jp.co.fujixerox.dmz.log;

import org.slf4j.LoggerFactory;

public class DMZLLogFactory {

	private static DMZLog systemLog;

	private static final String SYSTEM_LOGGER_NAME = "jp.co.fujixerox.dmz";

	private DMZLLogFactory() {
	}

	public static DMZLog getSystemLog() {
		if (systemLog == null) {
			initLog();
			systemLog = getlog(SYSTEM_LOGGER_NAME);

		}

		return systemLog;
	}

	private static DMZLog getlog(String loggerName) {
		return new DMZLogImpl(LoggerFactory.getLogger(loggerName));
	}

	private static void initLog() {

	}

	public static void main(String[] args) {
		DMZLog systemlog = getSystemLog();
		systemlog.info("Test:system");
	}
}
