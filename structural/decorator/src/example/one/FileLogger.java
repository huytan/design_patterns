package example.one;

public class FileLogger implements Logger {

	@Override
	public void log(String msg) {
		FileUtil file = new FileUtil();
		file.writeToFile("log.txt", msg, true, false);
	}
}
