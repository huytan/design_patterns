package bridge;

public class TextMessage implements Message {

	private MessageLogger logger;

	public TextMessage(MessageLogger l) {
		logger = l;
	}

	private String preProcess(String msg) {
		return msg;
	};

	@Override
	public void log(String msg) {
		String str = preProcess(msg);
		logger.logMsg(msg);
	}

}
