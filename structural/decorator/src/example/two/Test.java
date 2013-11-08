package example.two;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer = new Disk(computer);
		computer = new Monitor(computer);
		computer = new CD(computer);
		computer = new CD(computer);

		System.out.println("You are getting a " + computer.description());
	}

}
