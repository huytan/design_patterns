package example.two_interface.builder;

import example.two_interface.Order;

public interface OrderBuilder {
	Order order = new Order();

	public void isValidOrder(double total);

	public void addItems(String items);

	public void calsShipping();

	public void calcTax();

	public Order getOrder();
}
