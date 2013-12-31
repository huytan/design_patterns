import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculatorServices extends Remote {
	public long addNum(long a, long b) throws RemoteException;
}
