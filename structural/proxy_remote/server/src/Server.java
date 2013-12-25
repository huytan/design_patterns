import java.rmi.AlreadyBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

	public static void main(String[] args) throws RemoteException,
			AlreadyBoundException {

		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}

		CustomerFacade customerFacade = new CustomerFacade();
		Registry registry = LocateRegistry.createRegistry(Constant.RMI_PORT);
		registry.bind(Constant.RMI_ID, customerFacade);
		System.out.println("start is started");

	}
}
