package bridge;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public class FileUtil {

	DataOutputStream dos;

	public boolean writetoFile(String filName, String dataLine,
			boolean newLine, boolean isAppend) {
		if (newLine) {
			dataLine = dataLine + "\n";
		}
		try {
			File outFile = new File(filName);
			if (isAppend) {
				dos = new DataOutputStream(new FileOutputStream(filName, true));
			} else {
				dos = new DataOutputStream(new FileOutputStream(outFile));
			}
			dos.writeBytes(dataLine);
			dos.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
