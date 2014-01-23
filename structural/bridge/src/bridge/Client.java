package bridge;

public class Client {

	public static void main(String[] args) {
		// create an appropriate implementer object
		MessageLogger logger = new FileLogger();
		// choose required interface object and configure it with the
		// implementer object
		Message msg = new EncryptedMessage(logger);
		msg.log("Test Message");
	}

}
