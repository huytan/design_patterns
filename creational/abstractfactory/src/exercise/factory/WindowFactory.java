package exercise.factory;

import exercise.IBasic;
import exercise.IPremium;
import exercise.IPremiumPlus;
import exercise.impl.BasicWindow;
import exercise.impl.PremiumPlusWindow;
import exercise.impl.PremiumWindow;

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
