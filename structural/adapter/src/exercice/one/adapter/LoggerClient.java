package exercice.one.adapter;

import exercice.one.factorymethod.Logger;
import exercice.one.factorymethod.LoggerFactory;

public class LoggerClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LoggerFactory factory = new LoggerFactory();
		Logger logger = factory.getLoger("File");
		String msg = "Hello word object";
		FileLoggerAdapter adapter = new FileLoggerAdapter(logger);
		adapter.logMessage(msg);
	}
}
