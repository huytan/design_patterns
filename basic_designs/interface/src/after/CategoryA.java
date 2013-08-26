package after;

public class CategoryA implements ISalaryCalculator {
	double baseSalary;
	double OT;
	
	CategoryA(double base,double overTime){
		baseSalary = base;
		OT= overTime;
	}
	
	public double getSalary(){
		return (baseSalary + OT);
	}
}
