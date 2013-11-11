package exercice.one.factorymethod;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUitl {
	DataOutputStream dos;

	public void saveToFile(String fileName, String msg, boolean isAppendMode,
			boolean isNewLine) {
		if (isNewLine) {
			msg = "\n" + msg;
		}
		File outFile = new File(fileName);
		try {
			if (isAppendMode) {

				dos = new DataOutputStream(new FileOutputStream(fileName, true));

			} else {
				dos = new DataOutputStream(new FileOutputStream(outFile));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			dos.writeBytes(msg);
			dos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
