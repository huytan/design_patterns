package example;

public class Consultant extends AbsEmployee {

	public Consultant(String empName, String empID) {
		super(empName, empID);
	}

	@Override
	public String computeCompensation() {
		// TODO Auto-generated method stub
		return ("consultant salary is base + allowance + OT - tax deductions");
	}

}
