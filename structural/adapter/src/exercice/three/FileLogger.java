package exercice.three;

import java.io.FileNotFoundException;

import exercice.one.factorymethod.FileUitl;
import exercice.one.factorymethod.Logger;

public class FileLogger implements Logger {

	@Override
	public void log(String msg) {
		FileUitl fileUtil = new FileUitl();
		fileUtil.saveToFile("log.txt", msg, true, true);
	}

}
