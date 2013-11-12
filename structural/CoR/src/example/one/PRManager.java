package example.one;

public class PRManager {

	private BranchManager branchManager;
	private RegionalDirector regionalDirector;
	private VicePresident vicePresident;
	private PresidentCOO coo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PRManager manager = new PRManager();
		manager.createAuthorizationFlow();

		PurchaseRequest request = new PurchaseRequest(1, "Office Supplies",
				10000);
		manager.branchManager.authorize(request);

		request = new PurchaseRequest(2, "HardWare Procurement", 175000);
		manager.branchManager.authorize(request);

		request = new PurchaseRequest(3, "AD Campaign", 800000);
		manager.branchManager.authorize(request);
	}

	private void createAuthorizationFlow() {
		branchManager = new BranchManager("Robin");
		regionalDirector = new RegionalDirector("Oscar");
		vicePresident = new VicePresident("Kate");
		coo = new PresidentCOO("Drew");

		branchManager.setNextHandler(regionalDirector);
		regionalDirector.setNextHandler(vicePresident);
		vicePresident.setNextHandler(coo);

	}
}
