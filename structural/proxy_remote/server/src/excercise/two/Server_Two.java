package excercise.two;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import two.Constant;

public class Server_Two {
	public static void main(String[] args) throws RemoteException, AlreadyBoundException {
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
			
		}
	
		OrderFacade  order = new OrderFacade();
		Registry  registry = LocateRegistry.createRegistry(Constant.RMI_PORT);
		
		registry.bind(Constant.RMI_ID_ORDER, order);
		
		System.out.println("Server two is started");
	}
}
