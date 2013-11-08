package exercise.two;

import java.io.IOException;

public class DecryptFileReader extends ReaderDecorator {

	public DecryptFileReader(Reader reader) {
		super(reader);
	}

	private String decrypt(String msg) throws IOException {
		System.out.println("before" + msg);
		msg = msg.substring(1, msg.length())
				+ msg.substring(0,1);

		return msg;
	}

	public void print(String msg) throws IOException {
		msg = decrypt(msg);

		reader.print(msg);
	}
}
