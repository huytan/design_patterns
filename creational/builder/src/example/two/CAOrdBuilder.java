package example.two;

public class CAOrdBuilder implements OrderBuilder {
	Order inOrder = getOrder();

	@Override
	public boolean isValidOrder() {
		// TODO Auto-generated method stub

		return false;
	}

	@Override
	public void addItems() {
		// TODO Auto-generated method stub

	}

	@Override
	public double calcShipping() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcTax() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Order getOrder() {
		// TODO Auto-generated method stub
		return order;
	}

}
