package example.two;

public class OrderShoppingTest {

	public static final String xmlFile = "../builder/src/example/two/order.xml";
	public static final String CAO = "California orders";
	public static final String NONCAO = "Non-California orders";
	public static final String OSO = "Overseas orders";
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

		// director invokes different builder
		// methods
		director.pasre(OrderShoppingTest.xmlFile);

	}
}
