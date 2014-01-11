import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import saqib.rasul.Compute;
import saqib.rasul.RmiStarter;

public class ComputeEngineStarter extends RmiStarter {

	public ComputeEngineStarter() {
		super(Compute.class);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new ComputeEngineStarter();
	}

	@Override
	public void doCustomRmiHandling() {
		try {
			Compute engine = new ComputeEngine();
			Compute engineStub = (Compute) UnicastRemoteObject.exportObject(
					engine, 0);

			Registry registry = LocateRegistry.getRegistry();
			registry.rebind(Compute.SERVICE_NAME, engineStub);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
