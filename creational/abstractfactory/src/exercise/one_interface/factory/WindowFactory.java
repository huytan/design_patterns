package exercise.one_interface.factory;

import exercise.one_interface.IBasic;
import exercise.one_interface.IPremium;
import exercise.one_interface.IPremiumPlus;
import exercise.one_interface.impl.BasicWindow;
import exercise.one_interface.impl.PremiumPlusWindow;
import exercise.one_interface.impl.PremiumWindow;

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
