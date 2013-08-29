package example;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LogReader {
	// String DataLine = "";
	// public synchronized void read(String fileName) {
	// File inFile = new File(fileName);
	//
	// BufferedReader br;
	// try {
	// br = new BufferedReader(new InputStreamReader(new FileInputStream(
	// inFile)));
	// DataLine = br.readLine();
	//
	// System.out.println(DataLine);
	// br.close();
	// } catch (FileNotFoundException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// } catch (IOException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }

	InputStream is = null;
	DataInputStream dis = null;

	public synchronized void read(String fileName) {
		try {
			// create input stream from file input stream
			is = new FileInputStream(ContantDataManager.FILE_NAME);
			// create data input stream
			dis = new DataInputStream(is);

			// count the available bytes form the input stream
			int count = is.available();
			// create buffer
			byte[] bs = new byte[count];

			// read data into buffer
			dis.read(bs);

			// for each byte in the buffer
			for (byte b : bs) {
				// convert byte into character
				char c = (char) b;
				// print the character
				System.out.print(c);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
