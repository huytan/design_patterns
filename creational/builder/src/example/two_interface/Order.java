package example.two_interface;

import java.util.Vector;

import example.two_interface.util.FileUtil;
import example.two_interface.util.XMLParser;

public class Order {
	private Vector items;
	private double tax;
	private double shipping;

	public Order() {
		items = new Vector();
	}

	public Vector getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items.add(items);
	}

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

	public synchronized void save() {
		String msg = getItems().toString() + calTotal();
		FileUtil file = new FileUtil();
		file.wirteToFile("order.txt", msg, true, true);
	}

	public double calTotal() {
		return getShipping() + (XMLParser.getTotal() * getTax());
	}
}
