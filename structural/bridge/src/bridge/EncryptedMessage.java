package bridge;

public class EncryptedMessage implements Message {

	private MessageLogger logger;

	public EncryptedMessage(MessageLogger l) {
		logger = l;
	}

	private String preProcess(String msg) {
		msg = msg.substring(msg.length() - 1)
				+ msg.substring(0, msg.length() - 1);
		return msg;
	};

	@Override
	public void log(String msg) {
		String str = preProcess(msg);
		logger.logMsg(str);
	}

}
