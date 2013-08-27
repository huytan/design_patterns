package example;
public abstract class AbsEmployee {
	String name;
	String ID;

	// invariable parts
	public AbsEmployee(String empName, String empID) {
		this.name = empName;
		ID = empID;
	}

	public String getName() {
		return name;
	}

	public String getID() {
		return ID;
	}

	@Override
	public String toString() {
		String str = "Emp Name:: " + getName() + "EmpOD::" + getID();
		return str;
	}
	public void save() {
		// TODO Auto-generated method stub
		FileUtil futil = new FileUtil();
		futil.writeToFile("emp.txt",this.toString(),true,true);
	}
	//variable part of the behavior
	public abstract String computeCompensation();
}
