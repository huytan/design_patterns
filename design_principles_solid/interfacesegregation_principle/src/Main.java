import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		m.menu();
	}

	void menu() {
		Scanner in = new Scanner(System.in);
		Manager m = new Manager();
		System.out.println("--------Menu--------");
		System.out.println("--------Choose worker--------");
		System.out.println("1. worker");
		System.out.println("2. super worker");
		System.out.println("2. robot");
		System.out.println("Input a number: ");
		int num = in.nextInt();
		switch (num) {
		case 1:
			m.setWorker(new Worker());
			m.manage();
			break;
		case 2:
			m.setWorker(new SuperWorker());
			m.manage();
			break;
		case 3:
			m.setWorker(new Robot());
			m.manage();
			break;
		default:
			System.out.print("Error");
			break;
		}
	}

}
