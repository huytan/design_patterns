package exercice.three;

import exercice.one.factorymethod.FileLogger;

public class FileLoggerAdapter extends FileLogger implements LoggerIntr {
	HTMLLogger htmlLogger;
	EncFileLogger encFileLogger;

	public FileLoggerAdapter(HTMLLogger htmlLogger) {
		this.htmlLogger = htmlLogger;
		// TODO Auto-generated constructor stub
	}

	public FileLoggerAdapter(EncFileLogger encFileLogger) {
		this.encFileLogger = encFileLogger;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean logMessage(String msg) {
		if (encFileLogger != null) {
			encFileLogger.log(msg);
		}
		if (htmlLogger != null) {
			htmlLogger.log(msg);
		}
		return true;
	}

}
