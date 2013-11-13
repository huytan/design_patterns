package example.one;

import sun.font.CreatedFontTracker;

public class CustomerFacade {
	private String address;
	private String city;
	private String state;
	private String cardType;
	private String cardNumber;
	private String cardExpDate;
	private String fname;
	private String lname;

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
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

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public boolean saveCustomerData() {
		Address objAddress;
		Account objAccount = null;
		CreditCard objCreditCard;

		/*
		 * client is transparent from the following set of subsystem related
		 * operations.
		 */

		boolean validData = true;
		String errorMessage = "";

		objAccount = new Account(fname, lname);
		if (objAccount.isValid() == false) {
			validData = false;
			errorMessage += "Invalid FirstName/LastName" + "\n";
		}
		objAddress = new Address(address, city, state);
		if (objAddress.isValid() == false) {
			validData = false;
			errorMessage += "Invalid Address/City/State" + "\n";
		}
		objCreditCard = new CreditCard(cardType, cardNumber, cardExpDate);
		if (objCreditCard.isValid() == false) {
			validData = false;
			errorMessage += "Invalid CreditCard Info";
		}
		if (!validData) {
			System.out.println(errorMessage);
			return false;
		}
		if (objAccount.save() && objAddress.save() && objCreditCard.save()) {
			return true;
		} else {
			return false;
		}

	}
}
