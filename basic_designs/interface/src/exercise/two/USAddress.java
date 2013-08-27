package exercise.two;

public class USAddress implements IAddressValidator {
	String email;
	
	public USAddress(String email) {
		this.email = email;
	}

	@Override
	public boolean validate() {
		return new Key().checkvalidation(this.email);
	}

}
