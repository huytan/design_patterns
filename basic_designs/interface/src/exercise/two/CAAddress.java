package exercise.two;

public class CAAddress implements IAddressValidator {

	String email;

	public CAAddress(String email) {
		this.email = email;
	}

	@Override
	public boolean validate() {
		return new Key().checkvalidation(this.email);
	}

}
