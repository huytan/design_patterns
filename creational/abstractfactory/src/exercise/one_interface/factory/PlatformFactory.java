package exercise.one_interface.factory;

import exercise.one_interface.ContantDataManager;

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
