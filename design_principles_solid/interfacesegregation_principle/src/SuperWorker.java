import util.IFeeable;
import util.IWorkable;

public class SuperWorker implements IWorkable,IFeeable {
	public void eat() {
		// TODO Auto-generated method stub
		System.out.print("I am eating as super worker");
	}

	public void work() {
		// TODO Auto-generated method stub
		System.out.print("I am working as super worker");
	}
}
