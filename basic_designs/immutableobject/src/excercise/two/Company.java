package excercise.two;

public final class Company {
	private final String addressCompany;
	private final int phone;
	private final String nameCompany;
	private final String emailCompany;

	public Company(String addressCompany, int phone, String nameCompany,
			String emailCompany) {
		this.addressCompany = addressCompany;
		this.phone = phone;
		this.nameCompany = nameCompany;
		this.emailCompany = emailCompany;
	}

	public String getAddressCompany() {
		return addressCompany;
	}

	public int getPhone() {
		return phone;
	}

	public String getNameCompany() {
		return nameCompany;
	}

	public String getEmailCompany() {
		return emailCompany;
	}

}
