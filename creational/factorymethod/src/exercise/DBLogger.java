package exercise;

public class DBLogger implements ILogger {

	@Override
	public void log(String msg) {
		// TODO Auto-generated method stub
		FileUtil futil = new FileUtil();
		futil.writeToFile("db.txt", msg, true, true);
	}

}
