package exercise.three;

import java.io.IOException;

import exercise.two.Reader;

public class PrinText implements Reader {

	@Override
	public void print(String msg) throws IOException {
		System.out.println(msg);

	}

}
