package app.javapandit.java8.interfaces.functional;

import java.util.function.Supplier;

public class Java8Functional_SupplierExample {

	public static void main(String[] args) {

		// Supplier Example with get()
		System.out.println("Supplier Example with get()");
		Supplier<Double> randomValue = () -> Math.random();

		System.out.println("randomValue = () -> Math.random():\nrandomValue.get(): " + randomValue.get());
	}
}