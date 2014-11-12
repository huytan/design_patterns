package example.three;

public class Approver {
	private Approver nextApprover;
	private int dollarLimit;
	private boolean isOutOfOffice;
	private boolean canApproveInternational;
	private final String name;

	public Approver(String name, boolean canApproveInternational,
			int dollarLimit) {
		this.dollarLimit = dollarLimit;
		this.canApproveInternational = canApproveInternational;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void handle(ExpenseReport report) {
		if (!canApprove(report) || isOutOfOffice())
			nextApprover.handle(report);
		else
			report.approve(this);
	}

	private boolean canApprove(ExpenseReport report) {
		return report.getTotalDollarAmount() <= getDollarLimit()
				&& (canApproveInternational() || !report.isInternationalTravel());
	}

	public void setNextApprover(Approver approver) {
	      nextApprover = approver;
	}
	
	public boolean isOutOfOffice() {
		return isOutOfOffice;
	}

	public void setOutOfOffice(boolean isOutOfOffice) {
		this.isOutOfOffice = isOutOfOffice;
	}

	public int getDollarLimit() {
		return dollarLimit;
	}

	public boolean canApproveInternational() {
		return canApproveInternational;
	}

	public void setCanApproveInternational(boolean canApproveInternational) {
		this.canApproveInternational = canApproveInternational;
	}
}
