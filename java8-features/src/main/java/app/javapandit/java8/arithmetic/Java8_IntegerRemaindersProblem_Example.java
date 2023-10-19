package app.javapandit.java8.arithmetic;

public class Java8_IntegerRemaindersProblem_Example {

	public static void main(String[] args) {

		// Problem of Integer Remainders
		System.out.println("Problem of Integer Remainders\n");
		System.out.println("10 % 2 = " + (10 % 2) + "\n11 % 2 = " + (11 % 2));
		System.out.println("-15 % 2 = " + (-15 % 2) + " // Incorrect Result\n-16 % 2 = " + (-16 % 2));

		// Math.floorMod
		System.out.println("\nMath.floorMod(10,2): " + Math.floorMod(10, 2));
		System.out.println("Math.floorMod(11,2): " + Math.floorMod(11, 2));
		System.out.println("Math.floorMod(-15,2): " + Math.floorMod(-15, 2));
		System.out.println("Math.floorMod(-16,2): " + Math.floorMod(-16, 2));

		System.out.println("---------\n");

		// Problem of Position of a Hour hand of a Clock
		System.out.println("Problem of Position of a Hour hand of a Clock");

		System.out.println("(10 + 3) % 12 = " + ((10 + 3) % 12));
		System.out.println("(5 + 6) % 12 = " + ((5 + 6) % 12));
		System.out.print("(10 - 27) % 12 = " + (10 - 27) % 12);
		System.out.println(" // Incorrect Result\n");

		System.out.println("Math.floorMod(10 + 3, 12): " + Math.floorMod(10 + 3, 12));
		System.out.println("Math.floorMod(5 + 6, 12): " + Math.floorMod(5 + 6, 12));
		System.out.println("Math.floorMod(10 - 27, 12): " + Math.floorMod(10 - 27, 12));
	}

}