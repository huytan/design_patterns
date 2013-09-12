package example.two_interface.builder;

import java.util.Vector;

import example.two_interface.FileUtil;

public class OrderDirector {
	OrderBuilder builder;
	Vector result;

	public OrderDirector(OrderBuilder builder) {
		// TODO Auto-generated constructor stub
		this.builder = builder;
	}

	public void pasre(String XMLData) {
		FileUtil util = new FileUtil();
		result = util.readFileXML(XMLData);
		// System.out.println(rerult);
	}

	public Vector getResult() {
		return result;
	}

	public void build(String XMLData) {
		builder.isValidOrder(XMLData);
		builder.addItems();
		builder.calcShipping();
		builder.calcTax();
		
	}
}
