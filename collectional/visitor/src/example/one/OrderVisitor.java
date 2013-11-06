package example.one;

import java.util.Vector;

import example.one.impl.CaliforniaOrder;
import example.one.impl.NonCaliforniaOrder;
import example.one.impl.OverseaOrder;

public class OrderVisitor implements VisitorInterface {
	// private Vector orderObjList;
	private double orderTotal;

	public OrderVisitor() {
		// orderObjList = new Vector();
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
