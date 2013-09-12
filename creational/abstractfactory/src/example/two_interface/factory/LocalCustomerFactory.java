package example.two_interface.factory;

import example.two_interface.IAccount;
import example.two_interface.IAddress;
import example.two_interface.ICreditCard;
import example.two_interface.impl.LocalAccountImpl;
import example.two_interface.impl.LocalAddressImpl;
import example.two_interface.impl.LocalCreditCardImpl;

public class LocalCustomerFactory implements ICustomerFactory {
	private static LocalCustomerFactory instance;

	private LocalCustomerFactory() {
	}

	public static LocalCustomerFactory getLocalCustomerFactory() {
		if (instance == null) {
			instance = new LocalCustomerFactory();
		}
		return instance;
	}

	@Override
	public IAddress getAddress() {
		// TODO Auto-generated method stub
		return new LocalAddressImpl();
	}

	@Override
	public IAccount getAccount() {
		// TODO Auto-generated method stub
		return new LocalAccountImpl();
	}

	@Override
	public ICreditCard getCreditCard() {
		// TODO Auto-generated method stub
		return new LocalCreditCardImpl();
	}

}
