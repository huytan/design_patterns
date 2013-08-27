package example;
public class SalesRep extends AbsEmployee {

	public SalesRep(String empName, String empID,String department) {
		super(empName, empID,department);

	}

	// variable part behabior
	@Override
	public String computeCompensation() {
		// TODO Auto-generated method stub
		return ("sales Rep salary is base + commission + allowance - tax deductions");
	}

}
