package example.two_interface.builder;

import example.two_interface.Order;

public class NonCAOrdBuilder implements OrderBuilder {
	Order NonCAOrd = order;
	private double tax = 0.1;

	@Override
	public void isValidOrder(double total) {
		System.out.println("NonCAO");
		if (total >= 100) {
			tax = 1;
		}

	}

	public void addItems(String items) {
		NonCAOrd.setItems(items);
	}

	@Override
	public void calsShipping() {
		// TODO Auto-generated method stub
		NonCAOrd.setShipping(8);
	}

	@Override
	public void calcTax() {
		// TODO Auto-generated method stub
		NonCAOrd.setTax(tax);
	}

	@Override
	public Order getOrder() {
		// TODO Auto-generated method stub
		return NonCAOrd;
	}

}
