import util.IWorker;


public class SuperWorker implements IWorker {

	@Override
	public void work() {
		System.out.print("I'm super worker");
	}

}
