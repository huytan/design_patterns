package before;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CategoryA c= new CategoryA(1000, 200);
		Employee e = new Employee("Jennifer", c);
		
		//CategoryB b= new CategoryB(1000, 200);
		//Employee d = new Employee("Jennifer", b);  // ERROR:The constructor Employee(String, CategoryB) is undefined
		   	//	Change constructor in Employess class to CategoryB
		e.display();
	}

}
