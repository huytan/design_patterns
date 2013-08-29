package example.before;

public class EmployeeModel {
	private String firstName;
	private String lastName;
	private String SSN;
	private String address;
	private Car car;

	public EmployeeModel(String firstName, String lastName, String sSN,
			String address, Car car) {
		this.firstName = firstName;
		this.lastName = lastName;
		SSN = sSN;
		this.address = address;
		this.car = car;
	}

	// getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
}
