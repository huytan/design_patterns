package example.two_interface.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import example.two_interface.CreditCard;

public class RemoteCreditCardImpl extends UnicastRemoteObject implements
		CreditCard {
	private String cardType;
	private String cardNumber;
	private String cardExpDate;

	public RemoteCreditCardImpl(String cardType, String cardNumber,
			String cardExpDate) throws RemoteException {
		this.cardType = cardType;
		this.cardNumber = cardNumber;
		this.cardExpDate = cardExpDate;
	}

	 public RemoteCreditCardImpl() throws RemoteException {
	 // TODO Auto-generated constructor stub
	 }


	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean save() {
		// TODO Auto-generated method stub
		String dataLine = "Card Type:" + getCardType() + " Card Number: "
				+ getCardNumber() + " Card ExpDate: " + getCardExpDate();
		if (isValid()) {
			FileUtil fUtil = new FileUtil();
			return fUtil.writeToFile(ContantDataManager.REMOTE_CREDIT_FILE,
					dataLine, true, true);

		}
		return false;
	}

	@Override
	public String getCardType() {
		// TODO Auto-generated method stub
		return cardType;
	}

	@Override
	public String getCardNumber() {
		// TODO Auto-generated method stub
		return cardNumber;
	}

	@Override
	public String getCardExpDate() {
		// TODO Auto-generated method stub
		return cardExpDate;
	}

	@Override
	public void setCardType(String cardType) {
		// TODO Auto-generated method stub
		this.cardType = cardType;
	}

	@Override
	public void setCardNumber(String cardNumber) {
		// TODO Auto-generated method stub
		this.cardNumber = cardNumber;
	}

	@Override
	public void setCardExpDate(String cardExpDate) {
		// TODO Auto-generated method stub
		this.cardExpDate = cardExpDate;
	}

}
