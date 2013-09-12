package exercise_interface;

import java.util.*;
import java.io.*;

public class LoggerFactory {

	public String isFileLoggingEnabled() {
		Properties p = new Properties();
		try {
			p.load(ClassLoader.getSystemResourceAsStream("Logger.properties"));
			String fileLoggingValue = p.getProperty("FileLogging");
			if (fileLoggingValue
					.equalsIgnoreCase(ContantDataManager.CONSOLE_LOGGER) == true)
				return ContantDataManager.CONSOLE_LOGGER;
			else if (fileLoggingValue
					.equalsIgnoreCase(ContantDataManager.DB_LOGGER) == true)
				return ContantDataManager.DB_LOGGER;
			else
				return ContantDataManager.FILE_LOGGER;
		} catch (IOException e) {
			return null;
		}

	}

	// Factory Method
	public ILogger getLogger() {
		if (isFileLoggingEnabled().equalsIgnoreCase(
				ContantDataManager.FILE_LOGGER)) {
			return new FileLogger();
		}else if (isFileLoggingEnabled().equalsIgnoreCase(
				ContantDataManager.CONSOLE_LOGGER)) {
			return new ConsoleLogger();
		} 
		return null;
	}

}
