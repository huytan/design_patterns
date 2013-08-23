import util.IBarkable;
import util.IRunnable;

public class Dog implements IRunnable, IBarkable {
	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("Dog is barking");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Dog is running");
	}
}
