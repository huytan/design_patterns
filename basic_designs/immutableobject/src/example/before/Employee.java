package example.before;

public class Employee {
	private String firstName;
	private String lastName;
	private String SSN;
	private String address;
	private Car car;

	public Employee(String firstName, String lastName, String sSN,
			String address, Car car) {
		this.firstName = firstName;
		this.lastName = lastName;
		SSN = sSN;
		this.address = address;
		this.car = car;
	}

	// behavior
	public boolean save() {
		return true;
	}

	public boolean isValid() {
		return true;
	}

	public boolean update() {
		return true;
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
