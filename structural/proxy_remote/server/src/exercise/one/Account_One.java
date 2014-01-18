package exercise.one;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.UUID;

import one.Constant;

public class Account_One extends UnicastRemoteObject implements one.AccountIntr {

	private String fname;
	private String lname;
	private MessageError messageError;

	public Account_One() throws RemoteException {
		// TODO Auto-generated constructor stub
		messageError = MessageError.getInstance();
		System.out.println("Account object created");
	}

	public Account_One(String fname, String lname) throws RemoteException {
		// TODO Auto-generated constructor stub
		this.fname = fname;
		this.lname = lname;
	}

	public boolean isValid() throws RemoteException {
		if (!fname.equalsIgnoreCase("")) {
			return true;
		}
		if (!lname.equalsIgnoreCase("")) {
			return true;
		}
		setMessageError("Invalid FirstName/LastName");
		System.out.println(messageError.getMessageError());
		return false;
	}

	public boolean save(String id) {
		FileUtil file = new FileUtil();
		String dataLine = id + ":" + fname + ":" + lname;
		return file.writeToFile(Constant.ACCOUNT_FILE, dataLine, true, true);
	}

	public boolean save() {
		FileUtil file = new FileUtil();
		String dataLine = fname + ":" + lname;
		return file.writeToFile(Constant.ACCOUNT_FILE, dataLine, true, true);
	}

	@Override
	public void setFName(String inFName) throws RemoteException {
		fname = inFName;

	}

	@Override
	public void setLName(String inLName) throws RemoteException {
		lname = inLName;

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
	public boolean saveAccountData() throws RemoteException {
		// / new Account_One(fname, lname);

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
