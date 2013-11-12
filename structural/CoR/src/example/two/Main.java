package example.two;

public class Main {

	/**
	 * @param args
	 * 
	 * http://sinhvienluoi.blogspot.com/2012/09/chain-of-responsibility-pattern.html
	 */
	public static void main(String[] args) {
		Process firstProcess = new FirstProcess();
		Process secondProcess = new SecondProcess();
		Process thirdProcess = new ThirdProcess();
		firstProcess.SetNextProcess(secondProcess);
		secondProcess.SetNextProcess(thirdProcess);
		thirdProcess.SetNextProcess(null);
		firstProcess.Run();
	}

}
