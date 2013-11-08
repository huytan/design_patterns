package example.one;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtil {
	public FileUtil() {
		// TODO Auto-generated constructor stub
	}

	DataOutputStream dos;

	public boolean writeToFile(String fileName, String dataLine,
			boolean isAppendMode, boolean isNewLine) {
		if (isNewLine) {
			dataLine = "/n" + dataLine;
		}
		try {
			File outFile = new File(fileName);

			if (isAppendMode) {
				dos = new DataOutputStream(new FileOutputStream(fileName, true));
			} else {
				dos = new DataOutputStream(new FileOutputStream(outFile));
			}
			dos.writeBytes(dataLine);
			dos.close();
		} catch (FileNotFoundException e) {
			return (false);
		} catch (IOException e) {
			return (false);// TODO Auto-generated catch block
		}
		return (true);
	}
}
