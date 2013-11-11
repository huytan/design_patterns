package exercice.two;

import exercice.one.factorymethod.FileLogger;

public class FileLoggerAdapter extends FileLogger implements LoggerIntr {

	@Override
	public boolean logMessage(String msg) {
		if (msg != null) {
			log(msg);
		}
		return true;
	}

}
