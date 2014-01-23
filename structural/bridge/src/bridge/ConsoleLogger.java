package bridge;

public class ConsoleLogger implements MessageLogger {

	@Override
	public void logMsg(String msg) {
		System.out.println(msg);
	}

}
