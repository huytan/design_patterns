package exercise.three;

import java.io.IOException;

import example.one.decorator.EncryptLogger;
import example.one.Logger;
import example.one.LoggerFactory;
import exercise.one.FileReader;
import exercise.two.DecryptFileReader;
import exercise.two.Reader;

public class DecoratorClientExercise {
	public static void main(String[] args) throws IOException {
		LoggerFactory factory = new LoggerFactory();
		Logger logger = factory.getLogger();

		EncryptLogger eLogger = new EncryptLogger(logger);
		eLogger.log("Text");

		FileReader file = new FileReader();
		String data = file.readFromFile("log.txt");

		Reader reader = new PrinText();
		DecryptFileReader e = new DecryptFileReader(reader);
		e.print(data);
	}
}
