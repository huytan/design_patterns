package example.two.builder;

import example.two.Order;
import example.two.OrderShoppingTest;

public class OSOrdBuilder implements OrderBuilder {

	@Override
	public boolean isValidOrder(String a) {
		// TODO Auto-generated method stub

		return false;
	}

	@Override
	public void addItems() {
		// TODO Auto-generated method stub
	}

	@Override
	public double calcShipping() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcTax() {
		// TODO Auto-generated method stub
		return 0.2;
	}

	@Override
	public Order getOrder() {
		// TODO Auto-generated method stub
		return order;
	}

}
