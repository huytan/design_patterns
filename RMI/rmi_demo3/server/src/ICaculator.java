import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICaculator extends Remote {

	public int tinhtong(int a, int b) throws RemoteException;

}