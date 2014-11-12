package example.three;

public class Manager extends Approver {
	private static final int APPROVAL_LIMIT = 500;

	public Manager(String name, boolean canApproveInternational) {
		super(name, canApproveInternational, APPROVAL_LIMIT);
	}
	
}
