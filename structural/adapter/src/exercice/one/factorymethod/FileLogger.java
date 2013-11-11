package exercice.one.factorymethod;

import java.io.FileNotFoundException;

public class FileLogger implements Logger {

	@Override
	public void log(String msg) {
		FileUitl fileUtil = new FileUitl();
		fileUtil.saveToFile("log.txt", msg, true, true);
	}

}
