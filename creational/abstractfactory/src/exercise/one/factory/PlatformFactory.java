package exercise.one.factory;

import exercise.one.ContantDataManager;

public class PlatformFactory {

	public static IPlatformFactory getPlatformFactory(String mode) {
		if (mode.equalsIgnoreCase(ContantDataManager.WINDOW)) {
			return WindowFactory.getWindowFactory();
		} else if (mode.equalsIgnoreCase(ContantDataManager.UNIX)) {
			return UnixFactory.getUnixFactory();
		}
		return WindowFactory.getWindowFactory();
	}
}
