import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {

	public static void main(String[] args) throws RemoteException {

		ICaculator ca = new ImpCaculator();
		try {
			java.rmi.registry.LocateRegistry.createRegistry(1099);
			Naming.rebind("rmi://localhost/hahaha", ca);
			System.out.println("Server is running");

		} catch (MalformedURLException ex) {
			Logger.getLogger(Server.class.getName())
					.log(Level.SEVERE, null, ex);
		}

	}
}