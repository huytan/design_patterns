import java.rmi.RemoteException;
import java.rmi.activation.Activatable;
import java.rmi.activation.ActivationID;

// Thay vì extends từ UnicastRemoteObject thì chúng ta extends từ  Activatable và construstor mặc định phải chứ super(id,0);
public class CalcutatorImpl extends Activatable implements CalculatorServices  {

	protected CalcutatorImpl(ActivationID id, int data)
			throws RemoteException {
		super(id, 0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public long addNum(long a, long b) throws RemoteException {
		// TODO Auto-generated method stub
		return a+b;
	}

}
