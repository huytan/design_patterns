package exercise.one;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.UUID;

import one.Constant;
import one.CreditCardIntr;

public class CreditCard_One extends UnicastRemoteObject implements
		CreditCardIntr {
	private String cardType;
	private String cardNumber;
	private String cardExpDate;
	private String msgError;

	public CreditCard_One() throws RemoteException {
		// TODO Auto-generated constructor stub
	}

	// public CreditCard_One(String cardType, String cardNumber, String
	// cardExpDate)
	// throws RemoteException {
	// this.cardType = cardType;
	// this.cardNumber = cardNumber;
	// this.cardExpDate = cardExpDate;
	// }

	public boolean isValid() {
		if (cardType.equalsIgnoreCase("")) {
			return false;
		}
		if (cardNumber.equalsIgnoreCase("")) {
			return false;
		}
		if (cardExpDate.equalsIgnoreCase("")) {
			return false;
		}
		return true;
	}

	public boolean save(String id) {
		FileUtil file = new FileUtil();
		String dataLine = id + ":" + cardType + ":" + cardNumber + ":"
				+ cardExpDate;
		return file.writeToFile(Constant.CREDITCARD_FILE, dataLine, true, true);
	}

	public boolean save() {
		FileUtil file = new FileUtil();
		String dataLine = cardType + ":" + cardNumber + ":" + cardExpDate;
		return file.writeToFile(Constant.CREDITCARD_FILE, dataLine, true, true);
	}

	@Override
	public void setCardType(String inCardType) throws RemoteException {
		// TODO Auto-generated method stub
		cardType = inCardType;
	}

	@Override
	public void setCardNumber(String inCardNumber) throws RemoteException {
		// TODO Auto-generated method stub
		cardNumber = inCardNumber;
	}

	@Override
	public void setCardExpDate(String inCardExpDate) throws RemoteException {
		// TODO Auto-generated method stub
		cardExpDate = inCardExpDate;
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
	public boolean saveCreditCardData() throws RemoteException {
		boolean validData = true;
		if (isValid() == false) {
			validData = false;
			setMessageError("Invalid Card Type/Card Number/Card Expdate");
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
