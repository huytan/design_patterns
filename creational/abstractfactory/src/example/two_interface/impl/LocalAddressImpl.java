package example.two_interface.impl;

import example.two_interface.IAddress;

public class LocalAddressImpl implements IAddress {
	private String address;
	private String city;
	private String state;

	public LocalAddressImpl(String address, String city, String state) {
		this.address = address;
		this.city = city;
		this.state = state;
	}

	public LocalAddressImpl() {
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
		String dataLine = "Address:" + getAddress()+" City: "+getCity() + " State: "
				+ getState();
		if (isValid()) {
			FileUtil fUtil = new FileUtil();
			return fUtil.writeToFile(ContantDataManager.ADDRESS_FILE, dataLine,
					true, true);

		}
		return false;
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return address;
	}

	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return state;
	}

	@Override
	public String getCity() {
		// TODO Auto-generated method stub
		return city;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

}
