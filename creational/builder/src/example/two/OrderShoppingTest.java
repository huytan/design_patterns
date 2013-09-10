package example.two;

import example.two.builder.OrderBuilder;
import example.two.builder.OrderDirector;
import example.two.factory.BuilderFactory;

public class OrderShoppingTest {

	public static final String xmlFile = "../builder/src/example/two/order.xml";
	public static final String CAO = "California orders";
	public static final String NONCAO = "Non-California orders";
	public static final String OSO = "Overseas orders";

	public static final int TOTAL_AMOUNT = 100;

	static OrderBuilder builder;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BuilderFactory factory = new BuilderFactory();
		// create an appropriate builder instance
		builder = factory.getOrderBuilder(OrderShoppingTest.OSO);
		// configure the director with the builder
		OrderDirector director = new OrderDirector(builder);
		director.build(director.getResult().toString());
		director.pasre(OrderShoppingTest.xmlFile);

		Order order = builder.getOrder();
		order.save();
		// System.out.println(director.getResult().toString());

	}
}
