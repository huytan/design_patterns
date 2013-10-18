package example.two_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Account extends Remote {
	public boolean isValid() throws RemoteException;

	public boolean save() throws RemoteException;

	public String getFirstName()throws RemoteException ;

	public String getLastName() throws RemoteException;

	public void setFirstName(String firstName) throws RemoteException;

	public void setLastName(String lastName) throws RemoteException;
}
