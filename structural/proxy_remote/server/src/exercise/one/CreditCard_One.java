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
	private MessageError messageError;

	public CreditCard_One() throws RemoteException {
		messageError = MessageError.getInstance();
		System.out.println("CreditCard object created");
	}

	// public CreditCard_One(String cardType, String cardNumber, String
	// cardExpDate)
	// throws RemoteException {
	// this.cardType = cardType;
	// this.cardNumber = cardNumber;
	// this.cardExpDate = cardExpDate;
	// }

	public boolean isValid() throws RemoteException {
		// if (!cardType.equalsIgnoreCase("")) {
		// return true;
		// }
		if (!cardNumber.equalsIgnoreCase("")) {
			System.out.println("cardnumber");
			return true;
		}
		if (!cardExpDate.equalsIgnoreCase("")) {
			return true;
		}
		setMessageError("Invalid Card Type/Card Number/Card Expdate");
		System.out.println(messageError.getMessageError());
		return false;
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
	public void setCardExpDate(String inCardExpDate) throws RemoteException{
		// TODO Auto-generated method stub
		cardExpDate = inCardExpDate;
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
	public boolean saveCreditCardData() throws RemoteException {
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
