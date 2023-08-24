package app.javapandit.java5.scanner;

import java.util.Scanner;

public class JavaScanner_MultipleValuesExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name, Age and Salary: ");

		// String Input
		String name = scanner.next();

		// Numerical input
		int age = scanner.nextInt();
		double salary = scanner.nextDouble();

		// Output Inputs provided by User
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);

	}
}