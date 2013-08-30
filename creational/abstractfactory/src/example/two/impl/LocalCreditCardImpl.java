package example.two.impl;

import example.two.ICreditCard;

public class LocalCreditCardImpl implements ICreditCard {
	private String cardType;
	private String cardNumber;
	private String cardExpDate;

	public LocalCreditCardImpl(String cardType, String cardNumber,
			String cardExpDate) {
		this.cardType = cardType;
		this.cardNumber = cardNumber;
		this.cardExpDate = cardExpDate;
	}

	public LocalCreditCardImpl() {
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
		String dataLine = "Card Type:" + getCardType()+" Card Number: "+getCardNumber() + " Card ExpDate: "
				+ getCardExpDate();
		if (isValid()) {
			FileUtil fUtil = new FileUtil();
			return fUtil.writeToFile(ContantDataManager.CREDIT_FILE, dataLine,
					true, true);

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

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public void setCardExpDate(String cardExpDate) {
		this.cardExpDate = cardExpDate;
	}

}
