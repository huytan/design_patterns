package example.two;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IAddress extends Remote {
	public boolean isValid() throws RemoteException;

	public boolean save() throws RemoteException;

	public String getAddress() throws RemoteException;

	public String getState() throws RemoteException;

	public String getCity() throws RemoteException;

	public void setAddress(String address) throws RemoteException;

	public void setState(String state) throws RemoteException;

	public void setCity(String city) throws RemoteException;

}
