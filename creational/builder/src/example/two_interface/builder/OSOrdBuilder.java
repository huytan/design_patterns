package example.two_interface.builder;

import example.two_interface.Order;

public class OSOrdBuilder implements OrderBuilder {
	Order OSOrd = order;
	private double tax = 0.1;

	@Override
	public void isValidOrder(double total) {
		System.out.println("OSO");
		if (total < 100) {
			System.out.println("khong chap nhan");
			System.exit(1);
		}
	}

	@Override
	public void addItems(String items) {
		OSOrd.setItems(items);
	}

	@Override
	public void calsShipping() {
		// TODO Auto-generated method stub
		OSOrd.setShipping(10);
	}

	@Override
	public void calcTax() {
		OSOrd.setTax(tax);

	}

	@Override
	public Order getOrder() {
		return OSOrd;
	}

}
