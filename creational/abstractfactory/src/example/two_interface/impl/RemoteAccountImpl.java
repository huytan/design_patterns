package example.two_interface.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import example.two_interface.Account;

public class RemoteAccountImpl extends UnicastRemoteObject implements Account {
	private String firstName;
	private String lastName;

	public RemoteAccountImpl(String firstName, String lastName)
			throws RemoteException {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public RemoteAccountImpl() throws RemoteException {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean save() {
		String dataLine = "FirstName" + getFirstName() + " LastName: "
				+ getLastName();
		if (isValid()) {
			FileUtil fUtil = new FileUtil();
			return fUtil.writeToFile(ContantDataManager.REMOTE_ACOUNT_FILE, dataLine,
					true, true);

		}
		return false;
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return lastName;
	}

	@Override
	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		this.firstName = firstName;

	}

	@Override
	public void setLastName(String lastName) {
		// TODO Auto-generated method stub
		this.lastName = lastName;
	}

}
