package exercise.two;

import exercise.two.impl.WinBasicImpl;
import exercise.two.impl.WinPremiumImpl;
import exercise.two.impl.WinPremiumPlusImpl;

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
