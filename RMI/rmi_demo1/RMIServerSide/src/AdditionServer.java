import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;

public class AdditionServer {

	/**
	 * @param args
	 * @throws RemoteException
	 */
	public static void main(String[] args) throws RemoteException {
		try {
			//System.setProperty("java.security.policy", "client.policy");
			System.setSecurityManager(new RMISecurityManager());
			Addition addition = new Addition();

			Naming.rebind("rmi://localhost/ABC", addition);
			System.out.println("Addition Server is ready.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Addition Server failed: " + e);
		}

	}

}
