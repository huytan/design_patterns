public class FileLogger implements ILogger {
	private static FileLogger logger;

	// prevent clients from using the constructor
	private FileLogger() {
	}

	public static FileLogger getFileLogger() {
		if (logger == null) {
			logger = new FileLogger();
		}
		return logger;
	}

	@Override
	public synchronized void log(String msg) {
		// TODO Auto-generated method stub
		FileUtil futil = new FileUtil();
		futil.writeToFile("log.txt", msg, true, true);
	}

}
