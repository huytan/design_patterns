package example.two.builder;

import example.two.Order;
import example.two.OrderShoppingTest;

public class NonCAOrdBuilder implements OrderBuilder {

	@Override
	public boolean isValidOrder(String a) {
		// TODO Auto-generated method stub
//		int amount = Integer.parseInt(a);
//		if (amount > OrderShoppingTest.TOTAL_AMOUNT) {
//			return true;
//		}
		return false;
	}

	@Override
	public void addItems() {
		// TODO Auto-generated method stub

	}

	@Override
	public double calcShipping() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public double calcTax() {
		// TODO Auto-generated method stub
		return 0.15;
	}

	@Override
	public Order getOrder() {
		// TODO Auto-generated method stub
		return order;
	}

}
