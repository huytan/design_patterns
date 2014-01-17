package exercise.one;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.UUID;

import one.AddressIntr;
import one.Constant;

public class Address_One extends UnicastRemoteObject implements AddressIntr {
	private String address;
	private String city;
	private String state;
	private String msgError;

	public Address_One() throws RemoteException {
		// TODO Auto-generated constructor stub
	}

	// public Address_One(String address, String city, String state)
	// throws RemoteException {
	// this.address = address;
	// this.city = city;
	// this.state = state;
	// }

	public boolean isValid() {
		if (address.equalsIgnoreCase("")) {
			return false;
		}
		if (city.equalsIgnoreCase("")) {
			return false;
		}
		if (state.equalsIgnoreCase("")) {
			return false;
		}
		return true;
	}

	public boolean save(String id) {
		FileUtil file = new FileUtil();
		String dataLine = id + ":" + address + ":" + city + ":" + state;
		return file.writeToFile(Constant.ADDRESS_FILE, dataLine, true, true);
	}

	public boolean save() {
		FileUtil file = new FileUtil();
		String dataLine = address + ":" + city + ":" + state;
		return file.writeToFile(Constant.ADDRESS_FILE, dataLine, true, true);
	}

	@Override
	public void setAddress(String inAddress) throws RemoteException {
		address = inAddress;

	}

	@Override
	public void setCity(String inCity) throws RemoteException {
		city = inCity;

	}

	@Override
	public void setState(String inSate) throws RemoteException {
		state = inSate;
	}

	@Override
	public void setMessageError(String msg) {
		msgError = msg;

	}

	@Override
	public String getMessageError() throws RemoteException {
		// TODO Auto-generated method stub
		return msgError;
	}

	@Override
	public boolean saveAddressData() throws RemoteException {
		boolean validData = true;
		if (isValid() == false) {
			validData = false;
			setMessageError("Invalid Address/City/State");
		}
		if (!validData) {
			System.out.println(msgError);
			return false;
		}// get id
		UUID number = UUID.randomUUID();
		String id = number.toString();
		if (save(id)) {
			return true;
		} else {
			return false;
		}
	}
}
