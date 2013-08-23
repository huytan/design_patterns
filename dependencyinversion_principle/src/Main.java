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
		Manager m = new Manager();
		
		Scanner in = new Scanner(System.in);
		System.out.println("------Menu-----");
		System.out.println("---Choose a worker---");
		System.out.println("1. Worker");
		System.out.println("2. Super worker");
		System.out.print("Input a number to choose:");
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
		default:
			System.out.print("Error");
			break;
		}

	}
}
