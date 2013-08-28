package exercise.one;

import java.util.Scanner;

import sun.applet.Main;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainApp().menu();
	}

	void menu() {
		Account a = null;
		Scanner in = new Scanner(System.in);
		System.out.println("-------------Menu-------------");
		System.out.println("1. Saving Account");
		System.out.println("2. Checking Account");
		System.out.println("3. Exit");
		System.out.print("Choose type of account: ");
		int type = in.nextInt();
		int key = 0;
		switch (type) {
		case 1:
			a = new SavingAccount();
			System.out.println("1. Deposits");
			System.out.println("2. Balance");
			System.out.print("Choose function: ");
			key = in.nextInt();
			switch (key) {
			case 1:
				System.out.println("Input a number: ");
				int moneyDeposit = in.nextInt();
				a.deposits(moneyDeposit);
				menu();
			case 2:
				a.balanceEnquiries();
				menu();
			default:
				menu();
			}
		case 2:
			a = new CheckingAccount();
			System.out.println("1. Deposits");
			System.out.println("2. Balance");
			System.out.print("Choose function: ");
			key = in.nextInt();
			switch (key) {
			case 1:
				System.out.println("Input a number: ");
				int moneyDeposit = in.nextInt();
				a.deposits(moneyDeposit);
				menu();
			case 2:
				a.balanceEnquiries();
				menu();
			case 3:
				System.exit(0);
			default:
				menu();
			}
		case 3:
			System.exit(0);
		default:
			menu();
		}

	}

}
