import util.IWorkable;
import util.IWorker;

public class Manager {
	IWorkable worker;

	public void setWorker(IWorkable w) {
		worker = w;
	}

	public void manage() {
		worker.work();
	}
}