package example.one.decorator;

import example.one.Logger;

public class HTMLLogger extends LoggerDecorator {

	public HTMLLogger(Logger logger) {
		super(logger);
	}

	@Override
	public void log(String msg) {
		// add functionality
		msg = makeHTML(msg);
		
		// now forward the HTML text to the FileLogger
		logger.log(msg);
	}

	private String makeHTML(String msg) {
		// make it into HTML document
		msg = "<HTML><BODY>" + "<b>" + msg + "</b>" + "</BODY></HTML>";
		return msg;
	}
}// end of class
