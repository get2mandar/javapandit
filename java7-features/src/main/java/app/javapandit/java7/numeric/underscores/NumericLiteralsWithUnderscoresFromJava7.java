package app.javapandit.java7.numeric.underscores;

public class NumericLiteralsWithUnderscoresFromJava7 {

	// VALID EXAMPLES //
	
	// Supported in byte
	static byte improvedByte = 0b0010_0101;

	// Supported in int
	static int improvedInt = 10_00_000;

	// Supported in long
	static long improvedLong = 10_00_000l;

	// Supported in float
	static float improvedFloat = 10_00_000.16f;

	// Supported in double
	static double improvedDouble = 10_00_000.56d;

	// consecutive underscores
	static int value = 10__00;
	
	
	// INVALID EXAMPLES //
	
	// Adjacent to decimal point
	// float value = 10_.12F;
	// float value1 = 10._12F;

	// Adjacent to F or L
	// float value2 = 10.12F_;
	// float value3 = 10_.12_F;

	// At start or end
	// int value = 10_;
	// int value = _10;

	public static void main(String args[]) {

		System.out.println("improvedByte :" + improvedByte);
		System.out.println("improvedInt :" + improvedInt);
		System.out.println("improvedLong :" + improvedLong);
		System.out.println("improvedFloat :" + improvedFloat);
		System.out.println("improvedDouble :" + improvedDouble);
		System.out.println("consecutiveUnderscores :" + value);

	}

}
