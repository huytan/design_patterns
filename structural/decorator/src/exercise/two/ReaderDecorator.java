package exercise.two;

import java.io.IOException;

public class ReaderDecorator implements Reader {
	Reader reader;

	public ReaderDecorator(Reader reader) {
		this.reader = reader;
	}

	@Override
	public void print(String msg) throws IOException {
		reader.print(msg);

	}

}
