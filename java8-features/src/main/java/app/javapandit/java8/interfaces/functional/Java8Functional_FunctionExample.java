package app.javapandit.java8.interfaces.functional;

import java.util.function.Function;

public class Java8Functional_FunctionExample {

	public static void main(String[] args) {

		// Function Example with apply()
		System.out.println("Function Example with apply()");
		Function<Integer, Double> half = num -> num / 2.0;
		System.out.println("half.apply(20): " + half.apply(20));

		System.out.println("---------\n");

		// Function Example with andThen()
		System.out.println("Function Example with andThen()");
		Function<Integer, Double> trebleOfHalf = half.andThen(num -> num * 3);
		System.out.println(
				"trebleOfHalf = half.andThen(num -> num * 3):\ntrebleOfHalf.apply(10): " + trebleOfHalf.apply(10));

		System.out.println("---------\n");

		// Function Example with compose()
		System.out.println("Function Example with compose()");
		Function<Integer, Double> composeTrebleOfHalf = half.compose(num -> num * 3);
		System.out.println("composeTrebleOfHalf = half.compose(num -> num * 3):\ncomposeTrebleOfHalf.apply(5): "
				+ composeTrebleOfHalf.apply(5));

		System.out.println("---------\n");

		// Function Example Null Pointer Exception with andThen() and compose()
		System.out.println("Function Example Null Pointer Exception with andThen() and compose()");
		try {
			System.out.println("nullOfHalf = half.andThen(null):");
			Function<Integer, Double> nullOfHalf = half.andThen(null);
			System.out.println(nullOfHalf.apply(8));
		} catch (Exception ex) {
			System.out.println("Exception while passing null:");
			ex.printStackTrace();
		}

		System.out.println("---------\n");

		// Function Example with identity()
		System.out.println("Function Example with identity()");
		Function<Integer, Integer> identity = Function.identity();
		System.out.println("identity = Function.identity():\nidentity.apply(10): " + identity.apply(10));
	}
}