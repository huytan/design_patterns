package example.two.factory;

import java.rmi.RemoteException;

import example.two.IAccount;
import example.two.IAddress;
import example.two.ICreditCard;
import example.two.impl.RemoteAccountImpl;
import example.two.impl.RemoteAddressImpl;
import example.two.impl.RemoteCreditCardImpl;

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
	public IAddress getAddress() throws RemoteException {
		// TODO Auto-generated method stub
		return new RemoteAddressImpl();
	}

	@Override
	public IAccount getAccount() throws RemoteException {
		// TODO Auto-generated method stub
		return new RemoteAccountImpl();
	}

	@Override
	public ICreditCard getCreditCard() throws RemoteException {
		// TODO Auto-generated method stub
		return new RemoteCreditCardImpl();
	}

}
