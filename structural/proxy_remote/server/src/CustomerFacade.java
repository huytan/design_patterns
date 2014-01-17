import java.rmi.AlreadyBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.UUID;

//http://docs.oracle.com/javase/tutorial/rmi/TOC.html
public class CustomerFacade extends UnicastRemoteObject implements CustomerIntr {
	private String address;
	private String city;
	private String state;
	private String cardType;
	private String cardNumber;
	private String cardExpDate;
	private String fname;
	private String lname;
	private String errorMessage;

	protected CustomerFacade() throws RemoteException {
		super();
		System.out.println("Server object created");
	}

	// còn lỗi
	/*
	 * public static void main(String[] args) throws RemoteException,
	 * MalformedURLException, AlreadyBoundException { String port = "1099";
	 * String host = "localhost"; // check for hostname argument if (args.length
	 * == 1) { host = args[0]; } if (args.length == 2) { port = args[1]; } if
	 * (System.getSecurityManager() == null) { System.setSecurityManager(new
	 * RMISecurityManager()); } // create an instance of the server
	 * CustomerFacade customerFacade = new CustomerFacade(); // bind it with the
	 * rmi registry Naming.bind("//" + host + ":" + port + "/CustomerFacade",
	 * customerFacade); System.out.println("Service Bound"); }
	 */

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
	public void setFName(String inFName) throws RemoteException {
		fname = inFName;

	}

	@Override
	public void setLName(String inLName) throws RemoteException {
		lname = inLName;

	}

	@Override
	public void setCardType(String inCardType) throws RemoteException {
		cardType = inCardType;

	}

	@Override
	public void setCardNumber(String inCardNumber) throws RemoteException {
		cardNumber = inCardNumber;

	}

	@Override
	public void setCardExpDate(String inCardExpDate) throws RemoteException {
		cardExpDate = inCardExpDate;

	}

	@Override
	public boolean saveCustomerData() throws RemoteException {
		Address objAddress;
		Account objAccount;
		CreditCard objCreditCard;

		/*
		 * client is transparent from the following set of subsystem related
		 * operations
		 */
		boolean validData = true;

		objAccount = new Account(fname, lname);

		if (objAccount.isValid() == false) {
			validData = false;
			setMessageError("Invalid FirstName/LastName");
		}
		objAddress = new Address(address, city, state);
		if (objAddress.isValid() == false) {
			validData = false;
			setMessageError("Invalid Address/City/State");
		}
		objCreditCard = new CreditCard(cardType, cardNumber, cardExpDate);
		if (objCreditCard.isValid() == false) {
			validData = false;
			setMessageError("Invalid Card Type/Card Number/Card Expdate");
		}
		if (!validData) {
			System.out.println(errorMessage);
			return false;
		}
		// get id
		UUID number = UUID.randomUUID();
		String id = number.toString();
		// long id = Long.parseLong(number.toString());

		if (objAccount.save(id) && objAddress.save(id)
				&& objCreditCard.save(id)) {
			return true;
		} else {
			return false;
		}

		/*
		 * if (objAccount.save() && objAddress.save() && objCreditCard.save()) {
		 * return true; } else { return false; }
		 */

	}

	@Override
	public void setMessageError(String msg) {
		errorMessage = msg;

	}

	@Override
	public String getMessageError() throws RemoteException {
		return errorMessage;

	}
}
