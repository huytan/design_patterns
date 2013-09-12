package exercise_interface;

public class SubLoggerFactory extends LoggerFactory {

	@Override
	public ILogger getLogger() {
		if (isFileLoggingEnabled().equalsIgnoreCase(
				ContantDataManager.DB_LOGGER))
			return new DBLogger();
		return null;
	}
}
