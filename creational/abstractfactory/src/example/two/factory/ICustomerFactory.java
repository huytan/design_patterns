package example.two.factory;

import example.two.IAccount;
import example.two.IAddress;
import example.two.ICreditCard;

public interface ICustomerFactory {
	public IAddress getAddress();

	public IAccount getAccount();

	public ICreditCard getCreditCard();

}
