package exercice.one.factorymethod;

public class LoggerFactory {
	private static final String FILE = "File";
	private static final String CONSOLE = "Consloe";

	public static Logger getLoger(String mode) {
		if (mode.equalsIgnoreCase(LoggerFactory.FILE)) {
			return new FileLogger();
		} else if (mode.equalsIgnoreCase(LoggerFactory.CONSOLE)) {
			return new ConsoleLogger();
		}
		return new ConsoleLogger();
	}
}
