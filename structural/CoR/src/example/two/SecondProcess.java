package example.two;

public class SecondProcess extends Process {

	@Override
	protected void RunNext() {
		try {
			System.out.println("Beginning  second process .... ");
			Thread.sleep(3000);
			System.out.println("Ending  second process .... ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
