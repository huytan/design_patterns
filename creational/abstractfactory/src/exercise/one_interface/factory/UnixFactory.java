package exercise.one_interface.factory;

import exercise.one_interface.IBasic;
import exercise.one_interface.IPremium;
import exercise.one_interface.IPremiumPlus;
import exercise.one_interface.impl.BasicUnix;
import exercise.one_interface.impl.PremiumPlusUnix;
import exercise.one_interface.impl.PremiumUnix;

public class UnixFactory implements IPlatformFactory {
	private static UnixFactory instance;

	private UnixFactory() {
	}

	public static UnixFactory getUnixFactory() {
		if (instance == null) {
			instance = new UnixFactory();
		}
		return instance;
	}

	@Override
	public IBasic getBasic() {
		// TODO Auto-generated method stub
		return new BasicUnix();
	}

	@Override
	public IPremium getPremium() {
		// TODO Auto-generated method stub
		return new PremiumUnix();
	}

	@Override
	public IPremiumPlus getPremiumPlus() {
		// TODO Auto-generated method stub
		return new PremiumPlusUnix();
	}

}
