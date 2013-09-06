package exercise.one.factory;

import exercise.one.IBasic;
import exercise.one.IPremium;
import exercise.one.IPremiumPlus;
import exercise.one.impl.BasicUnix;
import exercise.one.impl.PremiumPlusUnix;
import exercise.one.impl.PremiumUnix;

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
