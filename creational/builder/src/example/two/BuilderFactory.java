package example.two;

public class BuilderFactory {
	public OrderBuilder getOrderBuilder(String str) {
		OrderBuilder builder = null;
		if (str.equals(OrderShoppingTest.CAO)) {
			builder = new CAOrdBuilder();
		} else if (str.equals(OrderShoppingTest.NONCAO)) {
			builder = new NonCAOrdBuilder();
		}else if (str.equals(OrderShoppingTest.OSO)) {
			builder = new OSOrdBuilder();
		}
		return builder;
	}
}
