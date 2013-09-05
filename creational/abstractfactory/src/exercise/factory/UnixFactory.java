package exercise.factory;

import exercise.IBasic;
import exercise.IPremium;
import exercise.IPremiumPlus;
import exercise.impl.BasicUnix;
import exercise.impl.PremiumPlusUnix;
import exercise.impl.PremiumUnix;

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
