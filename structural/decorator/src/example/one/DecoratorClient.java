package example.one;

import example.one.decorator.EncryptLogger;
import example.one.decorator.HTMLLogger;

public class DecoratorClient {
	public static void main(String[] args) {
		LoggerFactory factory = new LoggerFactory();
		Logger logger = factory.getLogger();
		
		HTMLLogger htmlLogger = new HTMLLogger(logger);
		// the decorator object provides the same interface
		htmlLogger.log("A message to Log");
		EncryptLogger eLogger = new EncryptLogger(logger);
		eLogger.log("Text");

	}
}
