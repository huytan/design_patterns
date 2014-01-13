import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ImpCaculator extends UnicastRemoteObject implements ICaculator {

	public ImpCaculator() throws RemoteException {
		super();
	}

	@Override
	public int tinhtong(int a, int b) throws RemoteException {
		return a + b;
	}
}