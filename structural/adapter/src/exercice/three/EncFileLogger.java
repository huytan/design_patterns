package exercice.three;

public class EncFileLogger extends FileLogger {

	@Override
	public void log(String msg) {
		msg = encrypt(msg);
		super.log(msg);
	}

	private String encrypt(String msg) {

		msg = msg.substring(msg.length() - 1)
				+ msg.substring(0, msg.length() - 1);
		return msg;
	}
}
