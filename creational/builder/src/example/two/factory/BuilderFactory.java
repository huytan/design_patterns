package example.two.factory;

import example.two.OrderShoppingTest;
import example.two.builder.CAOrdBuilder;
import example.two.builder.NonCAOrdBuilder;
import example.two.builder.OSOrdBuilder;
import example.two.builder.OrderBuilder;

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
