package example.two_interface.builder;

import example.two_interface.Order;

public class CAOrdBuilder implements OrderBuilder {

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
		return 1;
	}

	@Override
	public double calcTax() {
		// TODO Auto-generated method stub
		return 0.1;
	}

	@Override
	public Order getOrder() {
		// TODO Auto-generated method stub
		return order;
	}

}
