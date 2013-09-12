package exercise.two_interface;

import exercise.two_interface.impl.UnixBasicImpl;
import exercise.two_interface.impl.UnixPremiumImpl;
import exercise.two_interface.impl.UnixPremiumPlusImpl;

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
