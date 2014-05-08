package exercise.two;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import two.Constant;
import two.OrderIntr;

public class Client_Two {

	public static void main(String[] args) throws RemoteException,
			NotBoundException {
		Registry registry = LocateRegistry.getRegistry("localhost",
				Constant.RMI_PORT);

		OrderIntr order = (OrderIntr) registry.lookup(Constant.RMI_ID_ORDER);
		order.placeOrder("OR123456");

		System.out.println("Order processing completed");

	}

}
