package example.one;

public class PresidentCOO extends PRHandler {
	public PresidentCOO(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	static double LIMIT = 400000;

	@Override
	public boolean authorize(PurchaseRequest request) {
		double amount = request.getAmount();
		if (amount <= LIMIT) {
			System.out.println("President & COO " + getHandlerName()
					+ " has authorized the PR - " + request);
			return true;
		} else {
			System.out.println("PR - " + request + "couldn't be authorized.\n "
					+ "Executive Board needs to be "
					+ "consolted for approval \n" + "reason: Amount to large");
			return false;
		}
	}
}
