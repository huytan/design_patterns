package example.two.factory;

import java.rmi.RemoteException;

import example.two.IAccount;
import example.two.IAddress;
import example.two.ICreditCard;

public interface ICustomerFactory {
	public IAddress getAddress() throws RemoteException;

	public IAccount getAccount() throws RemoteException;

	public ICreditCard getCreditCard() throws RemoteException;

}
