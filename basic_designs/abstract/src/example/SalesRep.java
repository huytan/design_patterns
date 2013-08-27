package example;
public class SalesRep extends AbsEmployee {

	public SalesRep(String empName, String empID) {
		super(empName, empID);

	}

	// variable part behabior
	@Override
	public String computeCompensation() {
		// TODO Auto-generated method stub
		return ("sales Rep salary is base + commission + allowance - tax deductions");
	}

}
