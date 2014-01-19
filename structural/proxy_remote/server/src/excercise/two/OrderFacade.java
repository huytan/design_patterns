package excercise.two;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import two.OrderIntr;

public class OrderFacade extends UnicastRemoteObject implements OrderIntr {
	protected OrderFacade() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	private PaymentImpl pymt = new PaymentImpl();
	private InventoryImpl inventry = new InventoryImpl();
	
	@Override
	public void placeOrder(String orderId) throws RemoteException {
		// TODO Auto-generated method stub
		String step1 = inventry.checkInventory(orderId);
		String step2 = pymt.deductPayment(orderId);
		System.out
				.println("Following steps completed:" + step1 + " & " + step2);
	}


}
