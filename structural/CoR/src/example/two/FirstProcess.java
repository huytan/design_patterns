package example.two;

public class FirstProcess extends Process {

	@Override
	protected void RunNext() {

		try {
			System.out.println("Beginning  first process .... ");
			Thread.sleep(3000);
			System.out.println("Ending  first process .... ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
