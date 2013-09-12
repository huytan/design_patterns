package example.three_interface;

public class CSVBuilder implements OrderBuilder {

	@Override
	public String addHeader() {
		// TODO Auto-generated method stub
		return "Header CSV";
	}

	@Override
	public String addFooter() {
		// TODO Auto-generated method stub
		return "Footer CSV";
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
