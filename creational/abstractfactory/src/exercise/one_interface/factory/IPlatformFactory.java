package exercise.one_interface.factory;

import exercise.one_interface.IBasic;
import exercise.one_interface.IPremium;
import exercise.one_interface.IPremiumPlus;

public interface IPlatformFactory {
	IBasic getBasic();

	IPremium getPremium();

	IPremiumPlus getPremiumPlus();
}
