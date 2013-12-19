package com.test;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.interf.test.TestRemote;

public class RemoteImpl extends UnicastRemoteObject implements TestRemote {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected RemoteImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String isLoginValid(String username) throws RemoteException {
		if (username.equalsIgnoreCase("test")) {
			return "true";
		}
		return "false";
	}

}
