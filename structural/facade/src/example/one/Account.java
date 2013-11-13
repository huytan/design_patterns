package example.one;

public class Account {
	private String firstName;
	private String lastName;
	final String ACCOUNT_DATA_FILE = "AccountData.txt";

	public Account(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public boolean isValid() {
		return true;
	}

	public boolean save() {
		FileUtil fUtil = new FileUtil();
		String dataLine = getLastName() + "," + getFirstName();
		return fUtil.writeToFile(ACCOUNT_DATA_FILE, dataLine, true, true);

	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

}
