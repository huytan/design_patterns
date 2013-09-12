package example.two_interface.factory;

import java.rmi.RemoteException;

import example.two_interface.IAccount;
import example.two_interface.IAddress;
import example.two_interface.ICreditCard;
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
