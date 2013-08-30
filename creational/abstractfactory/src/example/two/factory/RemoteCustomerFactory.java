package example.two.factory;

import example.two.IAccount;
import example.two.IAddress;
import example.two.ICreditCard;

public class RemoteCustomerFactory implements ICustomerFactory {
	private static RemoteCustomerFactory instance;

	private RemoteCustomerFactory() {
		// TODO Auto-generated constructor stub
	}

	public static RemoteCustomerFactory getRemoteCustomerFactory() {
		if (instance == null) {
			instance = new RemoteCustomerFactory();
		}
		return instance;
	}

	@Override
	public IAddress getAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IAccount getAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ICreditCard getCreditCard() {
		// TODO Auto-generated method stub
		return null;
	}

}
