package one;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CreditCardIntr extends Remote {

	public void setCardType(String inCardType) throws RemoteException;

	public void setCardNumber(String inCardNumber) throws RemoteException;

	public void setCardExpDate(String inCardExpDate) throws RemoteException;

	public void setMessageError(String msg) throws RemoteException;

	public String getMessageError() throws RemoteException;

	public boolean saveCreditCardData() throws RemoteException;

	public boolean isValid() throws RemoteException;
}
