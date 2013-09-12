package example.two_interface.factory;

import java.rmi.RemoteException;

import example.two_interface.IAccount;
import example.two_interface.IAddress;
import example.two_interface.ICreditCard;

public interface ICustomerFactory {
	public IAddress getAddress() throws RemoteException;

	public IAccount getAccount() throws RemoteException;

	public ICreditCard getCreditCard() throws RemoteException;

}
