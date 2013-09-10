package example.three;

public interface OrderBuilder {
	Object order = new Object();

	void buildOrder();

	String addHeader();

	String addFooter();

	Object getOrder();
}
