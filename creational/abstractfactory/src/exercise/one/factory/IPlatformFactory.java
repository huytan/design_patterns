package exercise.one.factory;

import exercise.one.IBasic;
import exercise.one.IPremium;
import exercise.one.IPremiumPlus;

public interface IPlatformFactory {
	IBasic getBasic();

	IPremium getPremium();

	IPremiumPlus getPremiumPlus();
}
