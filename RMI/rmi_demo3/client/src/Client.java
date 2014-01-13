import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

	public static void main(String[] args) throws NotBoundException,
			MalformedURLException, RemoteException {

		ICaculator im = (ICaculator) Naming.lookup("rmi://localhost/hahaha");

		int sum = im.tinhtong(10, 8);
		System.out.println("Tong la”" + sum);
	}
}