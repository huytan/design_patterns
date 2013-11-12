package example.one;

public class VicePresident extends PRHandler {
	public VicePresident(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	static double LIMIT = 200000;

	@Override
	public boolean authorize(PurchaseRequest request) {
		double amount = request.getAmount();
		if (amount <= LIMIT) {
			System.out.println("Vice President " + getHandlerName()
					+ " has authorized the PR - " + request);
			return true;
		} else {
			// forward the request to the next handler
			return getNextHandler().authorize(request);
		}

	}

}
