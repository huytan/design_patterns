package exercise.two_interface;

import exercise.two_interface.impl.WinBasicImpl;
import exercise.two_interface.impl.WinPremiumImpl;
import exercise.two_interface.impl.WinPremiumPlusImpl;

public class WinPlanFactory extends HostingPlanFactory {

	@Override
	public IHostingPlan getBasicPlan() {
		// TODO Auto-generated method stub
		return new WinBasicImpl();
	}

	@Override
	public IHostingPlan getPremiumPlan() {
		// TODO Auto-generated method stub
		return new WinPremiumImpl();
	}

	@Override
	public IHostingPlan getPremiumPlusPlan() {
		// TODO Auto-generated method stub
		return new WinPremiumPlusImpl();
	}

}
