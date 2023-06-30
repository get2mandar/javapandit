package app.javapandit.java1.rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer extends UnicastRemoteObject implements RemoteInterface {

	// Serial ID due to Serializable
	private static final long serialVersionUID = -5895506729474653289L;

	// No-Arguments Constructor
	protected RMIServer() throws RemoteException {
		super();
	}

	public String helloTo(String name) throws RemoteException {
		System.err.println(name + " is trying to Connect!");
		return "Server Says: Hello, " + name + " !";
	}

	// Main Method
	public static void main(String[] args) {
		try {

			Naming.rebind("//localhost/MyServer", new RMIServer());
			System.err.println("Server is Ready");

		} catch (Exception ex) {

			System.err.println("Server Exception: " + ex.getMessage());
			ex.printStackTrace();

		}
	}

}
