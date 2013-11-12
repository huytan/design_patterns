package example.one;

public class RegionalDirector extends PRHandler {
	public RegionalDirector(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	static double LIMIT = 100000;

	@Override
	public boolean authorize(PurchaseRequest request) {
		double amount = request.getAmount();
		if (amount <= LIMIT) {
			System.out.println("Regional Director " + getHandlerName()
					+ " has authorized the PR - " + request);
			return true;
		} else {
			// forward the request to the next handler
			return getNextHandler().authorize(request);
		}
	}

}
