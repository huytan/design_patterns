import util.IFeeable;
import util.IWorkable;


public class Worker implements IWorkable,IFeeable {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.print("I am eating as worker");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.print("I am working as worker");
	}
}
