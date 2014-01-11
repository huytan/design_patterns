import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Addition extends UnicastRemoteObject implements AdditionInterface {

	protected Addition() throws RemoteException {
		super();
	}

	@Override
	public int Add(int a, int b) throws RemoteException {
		// TODO Auto-generated method stub
		int result = a + b;
		return result;
	}

}
