public class ConsoleLogger implements ILogger {
	private static ConsoleLogger console;

	private ConsoleLogger() {
	}

	public static ConsoleLogger getConsoleLogger() {
		if (console == null) {
			console = new ConsoleLogger();
		}
		return console;
	}

	@Override
	public synchronized void log(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
	}

}
