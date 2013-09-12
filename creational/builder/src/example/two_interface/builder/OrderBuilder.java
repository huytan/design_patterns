package example.two_interface.builder;

import example.two_interface.Order;

public interface OrderBuilder {
	Order order = new Order();

	void addItems();

	double calcShipping();

	double calcTax();

	Order getOrder();

	boolean isValidOrder(String a);
}
