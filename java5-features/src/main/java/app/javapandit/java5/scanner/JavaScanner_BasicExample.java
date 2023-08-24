package app.javapandit.java5.scanner;

import java.util.Scanner;

public class JavaScanner_BasicExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Username: ");

		String userName = scanner.nextLine(); // Read User Input
		System.out.println("Username is: " + userName); // Output Given User Input
	}
}
