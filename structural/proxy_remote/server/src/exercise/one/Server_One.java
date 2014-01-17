package exercise.one;

import java.rmi.AlreadyBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import one.Constant;

public class Server_One {

	public static void main(String[] args) throws RemoteException,
			AlreadyBoundException {

		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}

		Account_One account_One = new Account_One();
		Address_One address_One = new Address_One();
		CreditCard_One card_One = new CreditCard_One();

		Registry registry = LocateRegistry.createRegistry(Constant.RMI_PORT);
		registry.bind(Constant.RMI_ID, account_One);
		registry.rebind(Constant.RMI_ID, address_One);
		/*	registry.bind(Constant.RMI_ID, card_One);*/

		System.out.println("Server one is started");

	}
}
