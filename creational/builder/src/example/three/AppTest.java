package example.three;

public class AppTest {
	public static final String XMLBuilder = "XML";

	public static final String CSVBuilder = "CSV";
	public static final String OBJBuilder = "OBJ";
	static OrderBuilder builder;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuilderFactory factory = new BuilderFactory();
		builder = factory.getOrderBuilder(AppTest.XMLBuilder);
		OrderDirector director = new OrderDirector(builder);
		director.build();

		builder.getOrder();
	}

}
