package example.two_interface.factory;

import example.two_interface.OrderShoppingTest;
import example.two_interface.builder.CAOrdBuilder;
import example.two_interface.builder.NonCAOrdBuilder;
import example.two_interface.builder.OSOrdBuilder;
import example.two_interface.builder.OrderBuilder;

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
