package app.javapandit.java8.lambda;

public class Lambda_OperatorExample {

	public static void main(String[] args) {
		Operator<Integer> addOperation = (a, b) -> a + b;

		Operator<String> appendOperation = (a, b) -> a + b;

		Operator<Integer> multiplyOperation = (a, b) -> a * b;

		System.out.println("addOperation.process(3, 3): " + addOperation.process(3, 3)); // Prints 6
		System.out.println("appendOperation.process(\"3\", \"3\"): " + appendOperation.process("3", "3")); // Prints 33
		System.out.println("multiplyOperation.process(3, 3): " + multiplyOperation.process(3, 3)); // Prints 9

	}
}

@FunctionalInterface
interface Operator<T> {
	T process(T a, T b);
}