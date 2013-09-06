package exercise.two;

public abstract class HostingPlanFactory {

	public static HostingPlanFactory getHosting(String typeHosting) {
		if (typeHosting.equalsIgnoreCase(ContantDataManager.WINDOW)) {
			return new WinPlanFactory();
		}
		if (typeHosting.equalsIgnoreCase(ContantDataManager.UNIX)) {
			return new UnixPlanFactory();
		}
		return new WinPlanFactory();
	}

	public abstract IHostingPlan getBasicPlan();

	public abstract IHostingPlan getPremiumPlan();

	public abstract IHostingPlan getPremiumPlusPlan();
}
