package example.two.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import example.two.ICreditCard;

public class RemoteCreditCardImpl extends UnicastRemoteObject implements
		ICreditCard {
	private String cardType;
	private String cardNumber;
	private String cardExpDate;

	public RemoteCreditCardImpl(String cardType, String cardNumber,
			String cardExpDate) throws RemoteException {
		this.cardType = cardType;
		this.cardNumber = cardNumber;
		this.cardExpDate = cardExpDate;
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
		
	}

	@Override
	public void setCardNumber(String cardNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCardExpDate(String cardExpDate) {
		// TODO Auto-generated method stub
		
	}

}
