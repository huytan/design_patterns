package after;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISalaryCalculator c= new CategoryA(1000, 200);
		Employee e = new Employee("Jennifer", c);
		e.display();

		c= new CategoryB(2000, 800);
		e=new Employee("Rihana", c);
		e.display();
	
	}

}
