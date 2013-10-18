package example.two_interface.server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import example.two_interface.Account;
import example.two_interface.Address;
import example.two_interface.CreditCard;
import example.two_interface.impl.RemoteAccountImpl;
import example.two_interface.impl.RemoteAddressImpl;
import example.two_interface.impl.RemoteCreditCardImpl;

public class ServerRMI {
	public static ServerRMI server;

	private ServerRMI() {
		// TODO Auto-generated constructor stub
	}

	public static ServerRMI getInstance() {
		if (server == null) {
			server = new ServerRMI();
		}
		return server;
	}

	static Registry reg;

	public void start() {
		try {
			reg = LocateRegistry.createRegistry(1099);
			Account a = new RemoteAccountImpl();
			Address ad = new RemoteAddressImpl();
			CreditCard c = new RemoteCreditCardImpl();

			reg.rebind("myAccount", a);
			reg.rebind("myAddress", ad);
			reg.rebind("myCard", c);
			System.out.println("Server is ready...");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void stop() {
		try {
			reg.unbind("myAccount");
			reg.unbind("myAddress");
			reg.unbind("myCard");
			System.out.println("Server is stop...");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
