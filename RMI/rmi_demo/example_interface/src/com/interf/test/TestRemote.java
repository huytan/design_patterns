package com.interf.test;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TestRemote extends Remote {
	public String isLoginValid(String username) throws RemoteException;
}
