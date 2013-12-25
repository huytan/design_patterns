import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Connect {
	private static CustomerIntr remote;

	public static CustomerIntr getRemote() {
		return remote;
	}

	/**
	 * @param args
	 * @throws RemoteException
	 * @throws NotBoundException
	 */
	public static void main(String[] args) throws RemoteException,
			NotBoundException {
		Registry registry = LocateRegistry.getRegistry("localhost",
				Constant.RMI_PORT);
		remote = (CustomerIntr) registry.lookup(Constant.RMI_ID);

	}

}
