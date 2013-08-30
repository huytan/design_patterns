import java.io.IOException;
import java.util.Properties;

public class LoggerFactory {

	public boolean isFileLoggingEnabled() {
		Properties p = new Properties();

		try {
			p.load(ClassLoader.getSystemResourceAsStream("Logger.properties"));
			String fileLoggingValue = p.getProperty("FileLogging");
			if (fileLoggingValue.equalsIgnoreCase("CONSOLE") == true)
				return true;
			else
				return false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	public ILogger getLogger() {
		if (isFileLoggingEnabled()) {
			return ConsoleLogger.getConsoleLogger();
		} else {
			return FileLogger.getFileLogger();
		}
	}

}
