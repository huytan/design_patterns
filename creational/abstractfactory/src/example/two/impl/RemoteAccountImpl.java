package example.two.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import example.two.IAccount;

public class RemoteAccountImpl extends UnicastRemoteObject implements IAccount {
	private String firstName;
	private String lastName;

	public RemoteAccountImpl(String firstName, String lastName)
			throws RemoteException {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean save() {
		// TODO Auto-generated method stub
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
		
	}

	@Override
	public void setLastName(String lastName) {
		// TODO Auto-generated method stub
		
	}

}
