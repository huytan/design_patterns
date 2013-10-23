package example.two_interface.util;

import java.io.*;
import java.util.Vector;

public class FileUtil {
	DataOutputStream dos;

	public boolean wirteToFile(String fileName, String dataLine,
			boolean isAppendMode, boolean isNewLine) {

		if (isNewLine) {
			dataLine = "\n" + dataLine;
		}
		try {
			File outtFile = new File(fileName);
			if (isAppendMode) {
				dos = new DataOutputStream(new FileOutputStream(fileName, true));
			} else {
				dos = new DataOutputStream(new FileOutputStream(outtFile));
			}
			dos.writeBytes(dataLine);
			dos.close();
		} catch (Exception e) {
			e.printStackTrace();
			return (false);
		}
		return true;
	}

	/*
	 * Reads data from a given file into a Vector
	 */

	public Vector fileToVector(String fileName) {
		Vector v = new Vector();
		String inputLine;
		try {
			File inFile = new File(fileName);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream(inFile)));

			while ((inputLine = br.readLine()) != null) {
				v.addElement(inputLine.trim());
			}
			br.close();
		} // Try
		catch (FileNotFoundException ex) {
			//
		} catch (IOException ex) {
			//
		}
		return (v);
	}
}
