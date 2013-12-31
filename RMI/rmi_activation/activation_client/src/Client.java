import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		CalculatorServices cal = (CalculatorServices) Naming
				.lookup("rmi://localhost:1099/CalculatorServices");
		long kq = cal.addNum(1, 3);
		System.out.println("Result : " + kq);
	}
}
