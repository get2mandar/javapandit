package app.javapandit.java2.strictfpusage;

public class StrictfpExamples {

	public static void main(String[] args) {
		double num1 = 10e+102;
		double num2 = 6e+08;

		// Strictfp Class Example
		StrictfpClass classfp = new StrictfpClass();
		double classSum = classfp.sum(num1, num2);
		System.out.println("Class Strictfp Example - Sum: " + classSum);

		// Strictfp Method Example
		StrictfpUsingMethod methodfp = new StrictfpUsingMethod();
		double methodSum = methodfp.sum(num1, num2);
		System.out.println("Method Strictfp Example - Sum: " + methodSum);

		// Strictfp Interface Example
		StrictfpInterface infp = new StrictfpInterface() {
			public double sum(double value1, double value2) {
				return (value1 + value2);
			}
		};
		double inSum = infp.sum(num1, num2);
		System.out.println("Interface Strictfp Example - Sum: " + inSum);
	}

}
