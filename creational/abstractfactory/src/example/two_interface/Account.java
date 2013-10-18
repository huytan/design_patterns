package example.two_interface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Account extends Remote {
	public boolean isValid() throws Exception;

	public boolean save() throws Exception;

	public String getFirstName() throws Exception;

	public String getLastName() throws Exception;

	public void setFirstName(String firstName) throws Exception;

	public void setLastName(String lastName) throws Exception;
}
