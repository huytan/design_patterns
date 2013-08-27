package example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {
	File file;

	public void writeToFile(String filename, String content) {
		// TODO Auto-generated method stub
		try {
			file = new File(filename);
			if (!file.exists()) {
				file.createNewFile();
				wirtefile(filename, content);
			} else {
				FileReader fr = new FileReader(filename);
				BufferedReader br = new BufferedReader(fr);
				String oldString, newString = null;
				while ((oldString = br.readLine()) != null) {
					newString = oldString + content;
					wirtefile(filename, newString);
				}
				System.out.println(newString);
				br.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	void wirtefile(String filename, String content) {
		try {
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			//bw.newLine();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
