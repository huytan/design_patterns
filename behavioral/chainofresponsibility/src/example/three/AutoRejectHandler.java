package example.three;

public class AutoRejectHandler extends Approver {

	public AutoRejectHandler() {
		 super("auto-reject", false, 0);
	}

	@Override
	public void handle(ExpenseReport report) {
	   report.reject();
	}
}
