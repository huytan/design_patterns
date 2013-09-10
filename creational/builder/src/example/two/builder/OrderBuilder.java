package example.two.builder;

import example.two.Order;

public interface OrderBuilder {
	Order order = new Order();

	void addItems();

	double calcShipping();

	double calcTax();

	Order getOrder();

	boolean isValidOrder(String a);
}
