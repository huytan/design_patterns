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

	private void menu() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("----Emai content----");
		System.out.print("Input sender:");
		String sender = in.nextLine();
		System.out.print("Input receiver:");
		String receiver = in.nextLine();
		System.out.print("Input content:");
		String content = in.nextLine();
		System.out.print("Input \"ok\" to send mail:");
		String confirm = in.nextLine();

		if (confirm.equals("ok")) {
			Email e = new Email();
			e.setReceiver(receiver);
			e.setSender(sender);
			e.setContent(new Content(content));
		} else {
			System.out.print("Error!!");
		}
	}

}
