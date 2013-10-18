package example.two_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CreditCard extends Remote {
	public boolean isValid() throws RemoteException;

	public boolean save() throws RemoteException;

	public String getCardType() throws RemoteException;

	public String getCardNumber() throws RemoteException;

	public String getCardExpDate() throws RemoteException;

	public void setCardType(String cardType) throws RemoteException;

	public void setCardNumber(String cardNumber) throws RemoteException;

	public void setCardExpDate(String cardExpDate) throws RemoteException;
}
