package example.one;

public class HostingPlanManager {
	public static HostingPlanKit getHostingPlanKit(String platform) {
		HostingPlan basicPlan = null;
		HostingPlan premPlan = null;
		HostingPlan premPlusPlan = null;
		if (platform.equalsIgnoreCase("Win")) {
			basicPlan = new WinBasic();
			premPlan = new WinPremium();
			premPlusPlan = new WinPremiumPlus();
		}
		if (platform.equalsIgnoreCase("Unix")) {
			basicPlan = new UnixBasic();
			premPlan = new UnixPremium();
			premPlusPlan = new UnixPremiumPlus();
		}
		return new HostingPlanKit(basicPlan, premPlan, premPlusPlan);
	}
}
