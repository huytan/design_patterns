package exercise.two;

import exercise.two.impl.UnixBasicImpl;
import exercise.two.impl.UnixPremiumImpl;
import exercise.two.impl.UnixPremiumPlusImpl;

public class UnixPlanFactory extends HostingPlanFactory {

	@Override
	public IHostingPlan getBasicPlan() {
		// TODO Auto-generated method stub
		return new UnixBasicImpl();
	}

	@Override
	public IHostingPlan getPremiumPlan() {
		// TODO Auto-generated method stub
		return new UnixPremiumImpl();
	}

	@Override
	public IHostingPlan getPremiumPlusPlan() {
		// TODO Auto-generated method stub
		return new UnixPremiumPlusImpl();
	}

}
