package example.two;

import java.rmi.Remote;

public interface IAddress extends Remote {
	public boolean isValid() throws Exception;

	public boolean save() throws Exception;

	public String getAddress();

	public String getState();

	public String getCity();

	public void setAddress(String address);

	public void setState(String state);

	public void setCity(String city);

}
