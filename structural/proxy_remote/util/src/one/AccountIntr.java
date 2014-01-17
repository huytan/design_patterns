package one;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AccountIntr extends Remote {

	public void setFName(String inFName) throws RemoteException;

	public void setLName(String inLName) throws RemoteException;

	public void setMessageError(String msg) throws RemoteException;

	public String getMessageError() throws RemoteException;

	public boolean saveAccountData() throws RemoteException;

}
