package example;

public class Consultant extends AbsEmployee {
	
	public Consultant(String empName, String empID,String department) {
		super(empName, empID,department);
	}

	@Override
	public String computeCompensation() {
		// TODO Auto-generated method stub
		return ("consultant salary is base + allowance + OT - tax deductions");
	}

}
