package example.one.impl;

import example.one.Order;
import example.one.OrderVisitor;

public class CaliforniaOrder implements Order {
	private double orderAmount;
	private double additionalTax;

	public CaliforniaOrder() {
		// TODO Auto-generated constructor stub
	}

	public CaliforniaOrder(double inp_orderAmount, double inp_additionalTax) {
		orderAmount = inp_orderAmount;
		additionalTax = inp_additionalTax;
		// TODO Auto-generated constructor stub
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public double getAdditionalTax() {
		return additionalTax;
	}

	@Override
	public void accept(OrderVisitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}

}
