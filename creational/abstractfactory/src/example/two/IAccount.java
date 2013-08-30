package example.two;

import java.rmi.Remote;

public interface IAccount extends Remote {
	public boolean isValid() throws Exception;

	public boolean save() throws Exception;

	public String getFirstName();

	public String getLastName();

	public void setFirstName(String firstName);

	public void setLastName(String lastName);
}
