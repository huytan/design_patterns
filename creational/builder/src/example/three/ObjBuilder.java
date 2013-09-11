package example.three;

public class ObjBuilder implements OrderBuilder {
	Order order1 = (Order) order;

	@Override
	public String addHeader() {
		// TODO Auto-generated method stub
		return "Header Obj";
	}

	@Override
	public String addFooter() {
		// TODO Auto-generated method stub
		return "Footer Obj";
	}

	@Override
	public Object getOrder() {
		// TODO Auto-generated method stub

		return order1;
	}

	@Override
	public void buildOrder(Object object) {
		// TODO Auto-generated method stub

	}

}
