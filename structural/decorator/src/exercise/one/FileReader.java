package exercise.one;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReader {

	public static String readFromFile(String fileName) throws IOException {
		String dataLine = "";
		File inFile = new File(fileName);
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream(inFile)));

		dataLine = reader.readLine();
		reader.close();
		return dataLine;
	}

}
