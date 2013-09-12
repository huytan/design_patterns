package example.two_interface.impl;

import example.two_interface.IAccount;

public class LocalAccountImpl implements IAccount {
	private String firstName;
	private String lastName;

	public LocalAccountImpl(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public LocalAccountImpl() {
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
		String dataLine = "FirstName" + getFirstName() + " LastName: "
				+ getLastName();
		if (isValid()) {
			FileUtil fUtil = new FileUtil();
			return fUtil.writeToFile(ContantDataManager.ACOUNT_FILE, dataLine,
					true, true);

		}
		return false;
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
    
}
