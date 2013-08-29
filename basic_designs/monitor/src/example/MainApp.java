package example;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileLogger writeFile = new FileLogger();
		LogReader readFile = new LogReader();

		writeFile.log("3.tan \n");

		readFile.read(ContantDataManager.FILE_NAME);

	}

}
