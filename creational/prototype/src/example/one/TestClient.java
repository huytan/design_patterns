package example.one;

public class TestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HostingPlanManager manager = new HostingPlanManager();
		HostingPlanKit kit = manager.getHostingPlanKit("Win");
		HostingPlan plan = kit.getBasicPlan();
		System.out.println(plan.getFeatures());
		plan = kit.getPremPlusPlan();
		System.out.println(plan.getFeatures());

	}

}
