package app.javapandit.java1.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteInterface extends Remote {

	public String helloTo(String name) throws RemoteException;

}
