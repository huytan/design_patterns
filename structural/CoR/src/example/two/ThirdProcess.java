package example.two;

public class ThirdProcess extends Process {

	@Override
	protected void RunNext() {
		try {
			System.out.println("Beginning  third process .... ");
			Thread.sleep(3000);
			System.out.println("Ending  third process .... ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
