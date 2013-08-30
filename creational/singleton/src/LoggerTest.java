public class LoggerTest {
	public static void main(String[] args) {
		LoggerFactory factory = new LoggerFactory();
		// factory method call
		ILogger logger = factory.getLogger();
		logger.log("A message!!!");
	}
}
