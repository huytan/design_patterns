package two;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface OrderIntr extends Remote{
	public void placeOrder(String orderId) throws RemoteException ;
}
