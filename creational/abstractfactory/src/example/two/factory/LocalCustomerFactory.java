package example.two.factory;

import example.two.IAccount;
import example.two.IAddress;
import example.two.ICreditCard;
import example.two.impl.LocalAccountImpl;
import example.two.impl.LocalAddressImpl;
import example.two.impl.LocalCreditCardImpl;

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
