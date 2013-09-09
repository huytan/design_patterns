package example.two;

public class OrderDirector {
	OrderBuilder builder;

	public OrderDirector(OrderBuilder builder) {
		// TODO Auto-generated constructor stub
		this.builder = builder;
	}

	void pasre(String XMLData) {
		FileUtil util = new FileUtil();
		util.readFile(XMLData);
	}

	void build(String XMLData) {
		// builder.addItems();
		// builder.calcShipping();
		// builder.calcTax();
		// builder.isValidOrder();
		// builder.getOrder().save();
	}
}
