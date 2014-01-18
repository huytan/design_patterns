package one;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MessageIntr extends Remote {
	public void setMessageError(String msg) throws RemoteException;

	public String getMessageError() throws RemoteException;
}
