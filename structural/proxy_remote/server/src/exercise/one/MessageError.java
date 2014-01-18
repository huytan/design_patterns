package exercise.one;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import one.MessageIntr;

public class MessageError extends UnicastRemoteObject implements MessageIntr {
	private static MessageError instance;
	private static String msgError = null;

	private MessageError() throws RemoteException {
	}

	public static MessageError getInstance() throws RemoteException {
		if (instance == null) {
			instance = new MessageError();
		}
		return instance;
	}

	@Override
	public void setMessageError(String msg) throws RemoteException{
		msgError = msg;
	}

	@Override
	public String getMessageError() throws RemoteException {
		return msgError;

	}

}
