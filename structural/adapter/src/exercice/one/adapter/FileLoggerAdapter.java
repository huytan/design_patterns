package exercice.one.adapter;

import exercice.one.factorymethod.Logger;

public class FileLoggerAdapter extends LoggerIntr {
	Logger fileLogger;

	public FileLoggerAdapter(Logger fileLogger) {
		this.fileLogger = fileLogger;
	}

	@Override
	public boolean logMessage(String msg) {
		if (fileLogger.getClass().getName().equals("exercice.one.factorymethod.FileLogger")) {
			fileLogger.log(msg);
			return true;
		}
		return false;
	}
}
