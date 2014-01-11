import java.rmi.RemoteException;

import saqib.rasul.Compute;
import saqib.rasul.Task;

public class ComputeEngine implements Compute {

	@Override
	public <T> T executeTask(Task t) throws RemoteException {
		 System.out.println("got compute task: " + t);
		return (T) t.execute();
	}

}
