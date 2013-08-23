import util.IFlyable;
import util.IRunnable;

public class Bird implements IRunnable, IFlyable {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Bird is flying");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Bird is running");
	}
}
