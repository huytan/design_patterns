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
	private MessageError messageError;

	public Address_One() throws RemoteException {
		messageError = MessageError.getInstance();
		System.out.println("Address object created");
	}

	// public Address_One(String address, String city, String state)
	// throws RemoteException {
	// this.address = address;
	// this.city = city;
	// this.state = state;
	// }

	public boolean isValid() throws RemoteException {
		if (!address.equalsIgnoreCase("")) {
			return true;
		}
		if (!city.equalsIgnoreCase("")) {
			return true;
		}
		if (!state.equalsIgnoreCase("")) {
			return true;
		}
		setMessageError("Invalid Address/City/State");
		System.out.println(messageError.getMessageError());
		return false;
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
	public void setMessageError(String msg) throws RemoteException {
		messageError.setMessageError(msg);

	}

	@Override
	public String getMessageError() throws RemoteException {
		// TODO Auto-generated method stub
		return messageError.getMessageError();
	}

	@Override
	public boolean saveAddressData() throws RemoteException {
		// get id
		UUID number = UUID.randomUUID();
		String id = number.toString();
		if (save(id)) {
			return true;
		} else {
			return false;
		}
	}
}
