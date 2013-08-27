package exercise.two;

public class MainAddress {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IAddressValidator address = null;
		boolean flag = false;
		String email = "ayhao.com";
		address = new USAddress(email);
		flag = address.validate();
		if (flag) {
			System.out.println("ok");
		} else {
			System.out.println("fail");
		}
		email = "ay@hao.com";
		address = new CAAddress(email);
		flag = address.validate();
		if (flag) {
			System.out.println("ok");
		} else {
			System.out.println("fail");
		}
	}
}
