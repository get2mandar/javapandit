package app.javapandit.java1.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

public class RMIClientOperation {

	private static RemoteInterface rmiInterface;

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {

		rmiInterface = (RemoteInterface) Naming.lookup("//localhost/MyServer");
		String name = JOptionPane.showInputDialog("What is Your Name?");

		String response = rmiInterface.helloTo(name);
		JOptionPane.showMessageDialog(null, response);

	}
}
