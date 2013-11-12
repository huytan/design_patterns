package example.one;

public class BranchManager extends PRHandler {
	public BranchManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	static double LIMIT = 25000;

	@Override
	public boolean authorize(PurchaseRequest request) {
		double amount = request.getAmount();
		if (amount <= LIMIT) {
			System.out.println("Branch Manager " + getHandlerName()
					+ " has authorized the PR - " + request);
			return true;
		} else {
			// forward the request to the next handler
			return getNextHandler().authorize(request);
		}

	}

}
