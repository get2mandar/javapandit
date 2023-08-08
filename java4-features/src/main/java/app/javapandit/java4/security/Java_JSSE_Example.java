package app.javapandit.java4.security;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/**
 * Java Secure Socket Extension (JSSE) Example
 */
public class Java_JSSE_Example {

	public static void main(String[] args) {

		// For this Example to Work you need to have
		// Web Server Running on 127.0.0.1:8080

		try {
			SocketFactory factory = SSLSocketFactory.getDefault();
			Socket socket = factory.createSocket("127.0.0.1", 8080);

			OutputStream outputStream = socket.getOutputStream();
			PrintWriter out = new PrintWriter(outputStream);
			out.print("GET / HTTP/1.0\r\n\r\n");
			out.flush();

			InputStream inputStream = socket.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			BufferedReader in = new BufferedReader(inputStreamReader);

			String line;
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}
			out.close();
			in.close();
			socket.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
