package after;

public class Employee {
	ISalaryCalculator empType;
	String name;

	public Employee(String s, ISalaryCalculator c) {
		name = s;
		empType = c;
	}

	public void display() {
		System.out.println("Name=" + name);
		System.out.println("Salary=" + empType.getSalary());
	}
}
