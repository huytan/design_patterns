package example.two.factory;

public class CustomerUtil {
	private static final String LOCAL = "Local";
	private static final String REMOTE = "Remote";

	public static ICustomerFactory getCustFactory(String mode) {
		if (mode.equalsIgnoreCase(CustomerUtil.LOCAL)) {
			return LocalCustomerFactory.getLocalCustomerFactory();
		} else if (mode.equalsIgnoreCase(CustomerUtil.REMOTE)) {
			return RemoteCustomerFactory.getRemoteCustomerFactory();
		}
		return LocalCustomerFactory.getLocalCustomerFactory();
	}
}
