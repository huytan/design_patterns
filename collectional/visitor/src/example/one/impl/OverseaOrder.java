package example.one.impl;

import example.one.Order;

public class OverseaOrder implements Order {
	private double orderAmount;
	private double additionalSH;

	public OverseaOrder() {
		// TODO Auto-generated constructor stub
	}

	public OverseaOrder(double inp_orderAmount, double inp_additionalSH) {
		super();
		this.orderAmount = inp_orderAmount;
		this.additionalSH = inp_additionalSH;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public double getAdditionalSH() {
		return additionalSH;
	}

	@Override
	public void accept(OrderVisitor v) {
		v.visit(this);
	}
}
