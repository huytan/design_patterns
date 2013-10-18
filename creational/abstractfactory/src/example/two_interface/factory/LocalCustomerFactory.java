package example.two_interface.factory;

import example.two_interface.Account;
import example.two_interface.Address;
import example.two_interface.CreditCard;
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
	public Address getAddress() {
		// TODO Auto-generated method stub
		return new LocalAddressImpl();
	}

	@Override
	public Account getAccount() {
		// TODO Auto-generated method stub
		return new LocalAccountImpl();
	}

	@Override
	public CreditCard getCreditCard() {
		// TODO Auto-generated method stub
		return new LocalCreditCardImpl();
	}

}
