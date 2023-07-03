package app.javapandit.java2.strictfpusage;

public strictfp interface StrictfpInterface {

	// Strictfp Cannot be Applied on Interface (abstract) Methods
	// strictfp double compute(); // compile error

	public double sum(double value1, double value2);

}
