import util.IFeeable;
import util.IWorkable;

public class SuperWorker implements IWorkable, IFeeable {
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.print("I am eating as super worker");
	}
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.print("I am working as super worker");
	}
}
