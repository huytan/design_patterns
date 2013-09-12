package example.three_interface;

public class XMLBuilder implements OrderBuilder {

	@Override
	public String addHeader() {
		// TODO Auto-generated method stub
		return "Header XML";
	}

	@Override
	public String addFooter() {
		// TODO Auto-generated method stub
		return "Footer XML";
	}

	@Override
	public Object getOrder() {
		// TODO Auto-generated method stub
		return order;
	}

	@Override
	public void buildOrder(Object object) {
		// TODO Auto-generated method stub

	}

}
