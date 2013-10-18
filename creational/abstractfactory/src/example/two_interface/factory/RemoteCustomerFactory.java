package example.two_interface.factory;

import java.rmi.RemoteException;

import example.two_interface.Account;
import example.two_interface.Address;
import example.two_interface.CreditCard;
import example.two_interface.impl.RemoteAccountImpl;
import example.two_interface.impl.RemoteAddressImpl;
import example.two_interface.impl.RemoteCreditCardImpl;

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
	public Address getAddress() throws RemoteException {
		// TODO Auto-generated method stub
		return new RemoteAddressImpl();
	}

	@Override
	public Account getAccount() throws RemoteException {
		// TODO Auto-generated method stub
		return new RemoteAccountImpl();
	}

	@Override
	public CreditCard getCreditCard() throws RemoteException {
		// TODO Auto-generated method stub
		return new RemoteCreditCardImpl();
	}

}
