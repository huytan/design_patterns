public class CreditCard {
	private String cardType;
	private String cardNumber;
	private String cardExpDate;

	public CreditCard(String cardType, String cardNumber, String cardExpDate) {
		this.cardType = cardType;
		this.cardNumber = cardNumber;
		this.cardExpDate = cardExpDate;
	}

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

	public boolean save(long id) {
		FileUtil file = new FileUtil();
		String dataLine = id + ":" + cardType + ":" + cardNumber + ":"
				+ cardExpDate;
		return file.writeToFile(Constant.CREDITCARD_FILE, dataLine, true, true);
	}
}
