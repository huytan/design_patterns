package one;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AddressIntr extends Remote {
	public void setAddress(String inAddress) throws RemoteException;

	public void setCity(String inCity) throws RemoteException;

	public void setState(String inSate) throws RemoteException;

	public void setMessageError(String msg) throws RemoteException;

	public String getMessageError() throws RemoteException;

	public boolean saveAddressData() throws RemoteException;
	
	public boolean isValid() throws RemoteException;
}
