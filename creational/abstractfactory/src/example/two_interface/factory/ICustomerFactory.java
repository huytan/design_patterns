package example.two_interface.factory;

import java.rmi.RemoteException;

import example.two_interface.Account;
import example.two_interface.Address;
import example.two_interface.CreditCard;

public interface ICustomerFactory {
	public Address getAddress() throws RemoteException;

	public Account getAccount() throws RemoteException;

	public CreditCard getCreditCard() throws RemoteException;

}
