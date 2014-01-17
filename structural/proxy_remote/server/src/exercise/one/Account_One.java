package exercise.one;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.UUID;

import one.Constant;

public class Account_One extends UnicastRemoteObject implements one.AccountIntr {

	private String fname;
	private String lname;
	private String msgError;

	public Account_One() throws RemoteException {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("Account object created");
	}

	public Account_One(String fname, String lname) throws RemoteException {
		// TODO Auto-generated constructor stub
		this.fname = fname;
		this.lname = lname;
	}

	public boolean isValid() {
		if (fname.equalsIgnoreCase("")) {
			return false;
		}
		if (lname.equalsIgnoreCase("")) {
			return false;
		}
		return true;
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
	public void setMessageError(String msg) {
		msgError = msg;
	}

	@Override
	public String getMessageError() throws RemoteException {
		// TODO Auto-generated method stub
		return msgError;
	}

	@Override
	public boolean saveAccountData() throws RemoteException {
		// / new Account_One(fname, lname);
		boolean validData = true;

		if (isValid() == false) {
			validData = false;
			setMessageError("Invalid FirstName/LastName");
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
