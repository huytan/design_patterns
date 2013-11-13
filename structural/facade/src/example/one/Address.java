package example.one;

public class Address {
	private String address;
	private String city;
	private String state;
	final String ADDRESS_DATA_FILE = "Address.txt";

	public Address(String address, String city, String state) {
		this.address = address;
		this.city = city;
		this.state = state;
	}

	public boolean isValid() {
		/*
		 * The address validation algorithm could be complex in real-world
		 * application. Let's go with simpler validation here to keep the
		 * example simpler.
		 */
		if (getState().trim().length() < 2) {
			return false;
		}
		return true;
	}

	public boolean save() {
		FileUtil fUtil = new FileUtil();
		String dataLine = getAddress() + "," + getCity() + "," + getState();
		return fUtil.writeToFile(ADDRESS_DATA_FILE, dataLine, true, true);
	}

	public String getAddress() {
		return address;
	}

	public String getState() {
		return state;
	}

	public String getCity() {
		return city;
	}
}
