package app.javapandit.java2.strictfpusage;

public strictfp class StrictfpClass {

	// Strictfp Cannot be applied on fields
	// strictfp int in = 10; // compile error

	// Strictfp Cannot be applied on Constructors
	// strictfp StrictfpClass() {} // compile error

	public double sum(double value1, double value2) {
		return value1 + value2;
	}

}
