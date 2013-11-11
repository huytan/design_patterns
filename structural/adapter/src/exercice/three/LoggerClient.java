package exercice.three;

import exercice.one.factorymethod.Logger;
import exercice.one.factorymethod.LoggerFactory;

public class LoggerClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String msg = "Hello word three";
		HTMLLogger htmlLogger = new HTMLLogger();
		EncFileLogger encFileLogger = new EncFileLogger();
		FileLoggerAdapter adapter = new FileLoggerAdapter(htmlLogger);
		adapter.logMessage(msg);

		adapter = new FileLoggerAdapter(encFileLogger);
		adapter.logMessage(msg);
	}
}
