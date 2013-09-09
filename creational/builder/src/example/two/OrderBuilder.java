package example.two;

public interface OrderBuilder {
	Order order = new Order();

	boolean isValidOrder();

	void addItems();

	double calcShipping();

	double calcTax();

	Order getOrder();
}
