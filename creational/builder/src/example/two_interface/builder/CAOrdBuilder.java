package example.two_interface.builder;

import example.two_interface.Order;

public class CAOrdBuilder implements OrderBuilder {
	Order CAOrd = order;
	private double tax = 0.1;

	@Override
	public void isValidOrder(double total) {
		System.out.println("CAO");
		if (total >= 100) {
			tax = 1;
			CAOrd.setTax(tax);
		}
	}

	public void addItems(String items) {
		CAOrd.setItems(items);
	}

	@Override
	public void calsShipping() {
		// TODO Auto-generated method stub
		CAOrd.setShipping(9);
	}

	@Override
	public void calcTax() {
		// TODO Auto-generated method stub
		CAOrd.setTax(tax);
	}

	@Override
	public Order getOrder() {
		// TODO Auto-generated method stub
		return CAOrd;
	}

}
