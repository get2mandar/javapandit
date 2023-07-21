package app.javapandit.java4.ipv6;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Java_IPV6Examples {

	public static void main(String[] args) {

		try {
			System.setProperty("java.net.preferIPv6Addresses", "true");

			// One Way to Get IPv6 Address
			InetAddress localHostAddr = InetAddress.getLocalHost();
			System.out.println(localHostAddr.getHostAddress());

			System.out.println(" - - - - - - ");

			// Another Way to Get IPv6 Address
			System.out.println(Inet6Address.getLocalHost().getHostAddress());

			System.out.println(" - - - - - - ");

			// Normalize the IPv6 Address
			System.out.println(normalize("2001:db8:0:0:1:0:0:1"));
			System.out.println(normalize("2001:db8::1:0:0:1"));
			System.out.println(normalize("2001:db8:0:0:1::1"));

		} catch (UnknownHostException ex) {
			ex.printStackTrace();
		}
	}

	public static String normalize(String ipv6Str) throws UnknownHostException {
		return InetAddress.getByName(ipv6Str).getHostAddress();
	}

}
