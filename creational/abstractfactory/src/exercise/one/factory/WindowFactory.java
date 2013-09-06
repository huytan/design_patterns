package exercise.one.factory;

import exercise.one.IBasic;
import exercise.one.IPremium;
import exercise.one.IPremiumPlus;
import exercise.one.impl.BasicWindow;
import exercise.one.impl.PremiumPlusWindow;
import exercise.one.impl.PremiumWindow;

public class WindowFactory implements IPlatformFactory {
	private static WindowFactory instance;

	private WindowFactory() {
	}

	public static WindowFactory getWindowFactory() {
		if (instance == null) {
			instance = new WindowFactory();
		}
		return instance;
	}

	@Override
	public IBasic getBasic() {
		// TODO Auto-generated method stub
		return new BasicWindow();
	}

	@Override
	public IPremium getPremium() {
		// TODO Auto-generated method stub
		return new PremiumWindow();
	}

	@Override
	public IPremiumPlus getPremiumPlus() {
		// TODO Auto-generated method stub
		return new PremiumPlusWindow();
	}

}
