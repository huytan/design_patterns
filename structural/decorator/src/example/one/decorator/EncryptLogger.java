package example.one.decorator;

import example.one.Logger;

public class EncryptLogger extends LoggerDecorator {

	public EncryptLogger(Logger logger) {
		super(logger);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void log(String msg) {
		// add functionality
		msg = encrypt(msg);
		// now forward the encrypted text to the FileLogger for storage
		logger.log(msg);
	}

	private String encrypt(String msg) {
		// apply simple encryption by Transposition..
		// Shift all characters by one position
		msg = msg.substring(msg.length() - 1)
				+ msg.substring(0, msg.length() - 1);
		return msg;

	}
}// end of class
