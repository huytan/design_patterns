import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CustomerIntr extends Remote {
	public void setAddress(String inAddress) throws RemoteException;

	public void setCity(String inCity) throws RemoteException;

	public void setState(String inSate) throws RemoteException;

	public void setFName(String inFName) throws RemoteException;

	public void setLName(String inLName) throws RemoteException;

	public void setCardType(String inCardType) throws RemoteException;

	public void setCardNumber(String inCardNumber) throws RemoteException;

	public void setCardExpDate(String inCardExpDate) throws RemoteException;

	public void setMessageError(String msg) throws RemoteException;

	public String getMessageError() throws RemoteException;

	public boolean saveCustomerData() throws RemoteException;
}
