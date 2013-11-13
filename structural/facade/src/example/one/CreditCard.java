package example.one;

import com.sun.org.apache.xpath.internal.operations.Gte;

public class CreditCard {
	private String cardType;
	private String cardNumber;
	private String cardExpDate;
	final String CC_DATA_FLIE = "CC.txt";

	public CreditCard(String cardType, String cardNumber, String cardExpDate) {
		this.cardType = cardType;
		this.cardNumber = cardNumber;
		this.cardExpDate = cardExpDate;
	}

	public boolean isValid() {
		if (getCardType().equals(AccountManager.VISA)) {
			return (getCardNumber().trim().length() == 16);
		}
		if (getCardType().equals(AccountManager.DISCOVER)) {
			return (getCardNumber().trim().length() == 15);
		}
		if (getCardType().equals(AccountManager.MASTER)) {
			return (getCardNumber().trim().length() == 16);
		}
		return false;

	}

	public boolean save() {
		FileUtil fUtil = new FileUtil();
		String dataLine = getCardType() + "," + getCardNumber() + ","
				+ getCardExpDate();
		return fUtil.writeToFile(CC_DATA_FLIE, dataLine, true, true);
	}

	public String getCardExpDate() {
		return cardExpDate;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public String getCardType() {
		return cardType;
	}
}
