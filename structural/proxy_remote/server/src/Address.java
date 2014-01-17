public class Address {
	private String address;
	private String city;
	private String state;

	public Address(String address, String city, String state) {
		this.address = address;
		this.city = city;
		this.state = state;
	}

	public boolean isValid() {
		if (address.equalsIgnoreCase("")) {
			return false;
		}
		if (city.equalsIgnoreCase("")) {
			return false;
		}
		if (state.equalsIgnoreCase("")) {
			return false;
		}
		return true;
	}

	public boolean save(String id) {
		FileUtil file = new FileUtil();
		String dataLine = id + ":" + address + ":" + city + ":" + state;
		return file.writeToFile(Constant.ADDRESS_FILE, dataLine, true, true);
	}
	

	public boolean save() {
		FileUtil file = new FileUtil();
		String dataLine =  address + ":" + city + ":" + state;
		return file.writeToFile(Constant.ADDRESS_FILE, dataLine, true, true);
	}
}
