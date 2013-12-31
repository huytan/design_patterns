package com.test;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.interf.test.Constant;

public class RIMServer {

	/**
	 * @param args
	 * @throws RemoteException
	 * @throws AlreadyBoundException
	 */
	public static void main(String[] args) throws RemoteException,
			AlreadyBoundException {
		RemoteImpl impl = new RemoteImpl();
		Registry registry = LocateRegistry.createRegistry(Constant.RIM_PORT);
		registry.bind(Constant.RIM_ID, impl);

		System.out.println("start is started");
	}
}
