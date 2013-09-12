package example.two_interface;

import java.util.Vector;

public class Order {
	Vector items;
	double tax, shipping;

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getShipping() {
		return shipping;
	}

	public void setShipping(double shipping) {
		this.shipping = shipping;
	}

	public Vector getItems() {
		return items;
	}

	public void setItems(Vector items) {
		this.items = items;
	}

	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(Vector result) {
		// TODO Auto-generated constructor stub
		this.items = result;
	}

	public void save() {
		
	}
}
