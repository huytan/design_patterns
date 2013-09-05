package example.one;

public class HostingPlanKit {
	private HostingPlan basicPlan;
	private HostingPlan premPlan;
	private HostingPlan premPlusPlan;

	public HostingPlanKit(HostingPlan basicPlan, HostingPlan premPlan,
			HostingPlan premPlusPlan) {
		this.basicPlan = basicPlan;
		this.premPlan = premPlan;
		this.premPlusPlan = premPlusPlan;
	}

	public HostingPlan getBasicPlan() {
		return (HostingPlan) basicPlan.clone();
	}

	public HostingPlan getPremPlan() {
		return (HostingPlan) premPlan.clone();
	}

	public HostingPlan getPremPlusPlan() {
		return (HostingPlan) premPlusPlan.clone();
	}

}
