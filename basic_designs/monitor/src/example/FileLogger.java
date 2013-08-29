package example;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileLogger {
	public synchronized void log(String msg) {
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new FileOutputStream(
					ContantDataManager.FILE_NAME, true));
			dos.writeBytes(msg);
			dos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
