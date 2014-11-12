package example.three;

public class VicePresident extends Approver {
	private static final int APPROVAL_LIMIT = 100000;
	
	public VicePresident(String name) {
		super(name, true, APPROVAL_LIMIT);
	}

}
