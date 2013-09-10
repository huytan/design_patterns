package example.three;

public class BuilderFactory {
	public OrderBuilder getOrderBuilder(String type) {
		OrderBuilder builder = null;
		if (type.equalsIgnoreCase(AppTest.OBJBuilder)) {
			builder = new ObjBuilder();
		}
		if (type.equalsIgnoreCase(AppTest.XMLBuilder)) {
			builder = new XMLBuilder();
		}
		if (type.equalsIgnoreCase(AppTest.CSVBuilder)) {
			builder = new CSVBuilder();
		}
		return builder;
	}
}
