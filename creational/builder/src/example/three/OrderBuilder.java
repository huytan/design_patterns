package example.three;

public interface OrderBuilder {
	Object order = new Object();

	String addHeader();

	String addFooter();

	Object getOrder();

	void buildOrder(Object object);

}
