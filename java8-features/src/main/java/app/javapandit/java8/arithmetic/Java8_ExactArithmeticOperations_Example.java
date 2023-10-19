package app.javapandit.java8.arithmetic;

public class Java8_ExactArithmeticOperations_Example {

	public static void main(String[] args) {

		// Exact Methods: Normal Math Addition
		System.out.println("\nExact Methods: Normal Math Addition");

		System.out.print("Integer.MAX_VALUE + Integer.MAX_VALUE = " + Integer.MAX_VALUE + Integer.MAX_VALUE);
		System.out.println(" // Incorrect Result");

		// Exact Methods: Using Math.addExact
		System.out.println("\nExact Methods: Using Math.addExact");
		callAddExact();

		System.out.println("---------\n");

		// Exact Methods: Normal Math Multiplication
		System.out.println("Exact Methods: Normal Math Multiplication");
		System.out.print("100000 * 100000 = " + 100000 * 100000);
		System.out.println(" // Incorrect Result");

		// Exact Methods: Using Math.multiplyExact
		System.out.println("\nExact Methods: Using Math.multiplyExact");
		callMultiplyExact();

		System.out.println("---------\n");

		// Exact Methods: Assign a Long Value to Int
		System.out.println("Exact Methods: Assign a Long Value to Int");
		System.out.println("Long.MAX_VALUE: " + Long.MAX_VALUE);
		System.out.print("(int) Long.MAX_VALUE: " + (int) Long.MAX_VALUE);
		System.out.println(" // Incorrect Result\n");

		System.out.println("Math.toIntExact(10_00_00_000): " + Math.toIntExact(10_00_00_000));
		callToIntExact();

		System.out.println("---------\n");

		// Exact Methods: Using Math.nextDown
		System.out.println("Exact Methods: Using Math.nextDown");
		System.out.println("Math.nextDown(100): " + Math.nextDown(100));
		System.out.println("Math.nextDown(100.365): " + Math.nextDown(100.365));

		System.out.println("---------\n");
	}

	private static void callAddExact() {
		try {
			System.out.println("Math.addExact(Integer.MAX_VALUE, Integer.MAX_VALUE):");
			System.out.println(Math.addExact(Integer.MAX_VALUE, Integer.MAX_VALUE));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private static void callMultiplyExact() {
		try {
			System.out.println("Math.multiplyExact(100000, 100000):");
			System.out.println(Math.multiplyExact(100000, 100000));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private static void callToIntExact() {
		try {
			System.out.println("Math.toIntExact(Long.MAX_VALUE): " + Math.toIntExact(Long.MAX_VALUE));
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}