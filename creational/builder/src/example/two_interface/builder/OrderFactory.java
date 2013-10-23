package example.two_interface.builder;

public class OrderFactory {
	public OrderBuilder getOrderBuilder(String str) {
		OrderBuilder builder = null;
		if (str.equalsIgnoreCase("OH")) {
			builder = new OSOrdBuilder();
		} else if (str.equalsIgnoreCase("CA")) {
			builder = new CAOrdBuilder();
		} else if (str.equalsIgnoreCase("NonCA")) {
			builder = new NonCAOrdBuilder();
		}
		return builder;
	}
}
