package example;

import java.util.Vector;

import example.impl.CaliforniaOrder;
import example.impl.NonCaliforniaOrder;
import example.impl.OverseaOrder;

public class OrderVisitor implements VisitorInterface {
	private Vector orderObjList;
	private double orderTotal;

	public OrderVisitor() {
		orderObjList = new Vector();
	}

	@Override
	public void visit(NonCaliforniaOrder inp_order) {
		orderTotal += inp_order.getOrderAmount();

	}

	@Override
	public void visit(CaliforniaOrder inp_order) {
		orderTotal += inp_order.getOrderAmount() + inp_order.getAdditionalTax();
	}

	@Override
	public void visit(OverseaOrder inp_order) {
		orderTotal += inp_order.getOrderAmount() + inp_order.getAdditionalSH();
	}

	public double getOrderTotal() {
		return orderTotal;
	}

}
