package example;

import java.util.Date;

public abstract class Employee {
	String name;
	String ID;
	String department;

	// invariable parts
	public Employee(String empName, String empID, String empDepartment) {
		this.name = empName;
		this.ID = empID;
		this.department = empDepartment;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public String getID() {
		return ID;
	}

	@Override
	public String toString() {
		String str = "Emp Name:: " + getName() + " EmpID:: " + getID() + " Emp Department:: "+getDepartment() +" Date:: " +new Date().getDate()+"/"+new Date().getMonth();
		return str;
	}

	public void save() {
		// TODO Auto-generated method stub
		FileUtil futil = new FileUtil();
		futil.writeToFile("emp.txt", this.toString());
	}

	// variable part of the behavior
	public abstract String computeCompensation();
}
