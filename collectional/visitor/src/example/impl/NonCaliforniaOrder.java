package example.impl;

import example.Order;
import example.OrderVisitor;

public class NonCaliforniaOrder implements Order {

	private double orderAmount;

	public NonCaliforniaOrder() {
		// TODO Auto-generated constructor stub
	}

	public NonCaliforniaOrder(double inp_orderAmount) {
		// TODO Auto-generated constructor stub
		orderAmount = inp_orderAmount;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	@Override
	public void accept(OrderVisitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}
}
