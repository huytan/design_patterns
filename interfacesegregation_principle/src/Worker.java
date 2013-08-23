import util.IWorker;

public class Worker implements IWorker {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.print("I am eating");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.print("I am working");
	}
}
