package example.two.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import example.two.IAddress;

public class RemoteAddressImpl extends UnicastRemoteObject implements IAddress {
	private String address;
	private String city;
	private String state;

	public RemoteAddressImpl(String address, String city, String state)
			throws RemoteException {
		this.address = address;
		this.city = city;
		this.state = state;
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
	public String getAddress() {
		// TODO Auto-generated method stub
		return address;
	}

	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return state;
	}

	@Override
	public String getCity() {
		// TODO Auto-generated method stub
		return city;
	}

	@Override
	public void setAddress(String address) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setState(String state) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setCity(String city) {
		// TODO Auto-generated method stub

	}

}
