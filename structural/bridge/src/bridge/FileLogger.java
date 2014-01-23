package bridge;

public class FileLogger implements MessageLogger {

	@Override
	public void logMsg(String msg) {
		FileUtil fileUtil = new FileUtil();
		fileUtil.writetoFile("log.txt", msg, true, true);

	}

}
