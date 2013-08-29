public class FileLogger implements ILogger {

	@Override
	public void log(String msg) {
		// TODO Auto-generated method stub
		FileUtil futil = new FileUtil();
		futil.writeToFile("log.txt", msg, true, true);
	}

}
