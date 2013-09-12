package exercise_interface;

public class LoggerTest {

	public static void main(String[] args) {
		// implement a different class selection criterion
		LoggerFactory factory = new SubLoggerFactory();
		ILogger logger = factory.getLogger();
		logger.log("A Message to Log");
	}

}
