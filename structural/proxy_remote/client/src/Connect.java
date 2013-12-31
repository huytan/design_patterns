import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Connect {
	private static CustomerIntr remote;

	private static Connect connect ;

	public static Connect getConnect() throws RemoteException, NotBoundException {
		if (connect == null) {
			connect = new Connect();
		}
		return connect;
	}

	public CustomerIntr getRemote() {
		return remote;
	}

	public Connect() throws RemoteException, NotBoundException {
		Registry registry = LocateRegistry.getRegistry("localhost",
				Constant.RMI_PORT);
		remote = (CustomerIntr) registry.lookup(Constant.RMI_ID);
	}

}
