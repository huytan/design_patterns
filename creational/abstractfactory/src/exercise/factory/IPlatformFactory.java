package exercise.factory;

import exercise.IBasic;
import exercise.IPremium;
import exercise.IPremiumPlus;

public interface IPlatformFactory {
	IBasic getBasic();

	IPremium getPremium();

	IPremiumPlus getPremiumPlus();
}
