package example.after;

public final class EmployeeModel {
	// state
	private final String firstName;
	private final String lastName;
	private final String SSN;
	private final String address;
	private final Car car;

	public EmployeeModel(String fn, String ln, String sSN, String ad, Car c) {
		firstName = fn;
		lastName = ln;
		SSN = sSN;
		this.address = ad;
		this.car = c;
	}

	// getters
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSSN() {
		return SSN;
	}

	public String getAddress() {
		return address;
	}

	public Car getCar() {
		// return a copy of the car object
		return (Car) car.clone();
	}

}
