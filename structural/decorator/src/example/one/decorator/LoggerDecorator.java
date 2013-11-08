package example.one.decorator;

import example.one.Logger;

public class LoggerDecorator implements Logger {
	protected Logger logger;

	public LoggerDecorator(Logger logger) {
		this.logger = logger;
	}

	@Override
	public void log(String msg) {
		// Default implementation to be overriden by subclasses
		logger.log(msg);
	}
}// end class
