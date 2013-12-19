package com.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.interf.test.Constant;
import com.interf.test.TestRemote;

public class TestClient {

	/**
	 * @param args
	 * @throws RemoteException
	 * @throws NotBoundException
	 */
	public static void main(String[] args) throws RemoteException,
			NotBoundException {
		Registry registry = LocateRegistry.getRegistry("localhost",
				Constant.RIM_PORT);
		TestRemote remote = (TestRemote) registry.lookup(Constant.RIM_ID);

		System.out.println(remote.isLoginValid("ak"));
		System.out.println(remote.isLoginValid("test"));
	}

}
