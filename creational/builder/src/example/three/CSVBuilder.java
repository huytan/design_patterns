package example.three;

public class CSVBuilder implements OrderBuilder {

	@Override
	public void buildOrder() {
		// TODO Auto-generated method stub
		
	}

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

}
