package before;

import java.util.Scanner;

public class DemoDispatcher {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int optoin = goChoiceFromMenu();
		switch (optoin) {
		case 1:
			System.out.println("add a student, now");
			break;
		case 2:
			System.out.println("update a student, now");
			break;
		case 3:
			System.out.println("delete a student, now");
			break;
		case 4:
			System.out.println("display a student, now");
			break;
		case 5:
			System.out.println("OK, exit");
			break;
		default:
			System.out.println("Wrong!");
		}
	}

	private static int goChoiceFromMenu() {
		System.out.println("Option 1. Add a student");
		System.out.println("Option 2. Update a student");
		System.out.println("Option 3. Delete a student");
		System.out.println("Option 4. Display a student");
		System.out.println("Option 5. Exit");
		System.out.println("Enter :");
		int choice = Integer.parseInt(sc.next());
		return choice;
	}
}
