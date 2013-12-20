import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtil {

	DataOutputStream dos;

	public boolean writeToFile(String fileName, String dataLine,
			boolean isAppendMode, boolean isNewLine) {
		if (isNewLine) {
			dataLine = "\n" + dataLine;
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
		} catch (FileNotFoundException ex) {
			return (false);
		} catch (IOException ex) {
			return (false);
		}
		return (true);

	}
}
