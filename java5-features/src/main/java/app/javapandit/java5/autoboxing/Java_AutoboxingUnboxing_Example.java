package app.javapandit.java5.autoboxing;

public class Java_AutoboxingUnboxing_Example {

	public static void main(String[] args) {

		int intValue = 50;

		Integer intgValueOne = new Integer(intValue); // Boxing

		Integer intgValueTwo = 25; // Boxing

		System.out.println("Boxing: intgValueOne-" + intgValueOne + " | intgValueTwo-" + intgValueTwo);

		if (intgValueOne < 100) { // UnBoxing Internally
			System.out.println("Auto UnBoxing Condition: (intgValueOne < 100) - " + (intgValueOne < 100));
		}

		// Example Auto Boxing : Widening beats Boxing
		short s = 30;
		System.out.println("\nValue Passed: short s = 30");
		wideningBeatsBoxing(s);

		// Example Auto Boxing : Widening beats varargs
		short s1 = 30, s2 = 40;
		System.out.println("\nValue Passed: short s1 = 30, s2 = 40");
		wideningBeatsVarargs(s1, s2);

		int a = 30;
		// Example Auto Boxing : Boxing beats varargs
		System.out.println("\nValue Passed: int a = 30");
		boxingBeatsVarargs(a);

		// Example Method Overloading : Widening and Boxing
		// Compile time Error
		// methodOverloadingWideningAndBoxing(a);
	}

	// Auto-Boxing where Widening beats Boxing
	static void wideningBeatsBoxing(int i) {
		System.out.println("wideningBeatsBoxing(int)");
	}

	static void wideningBeatsBoxing(Integer i) {
		System.out.println("wideningBeatsBoxing-Integer");
	}

	// Auto-Boxing where Widening beats Varargs
	static void wideningBeatsVarargs(int i, int i2) {
		System.out.println("wideningBeatsVarargs(int,int)");
	}

	static void wideningBeatsVarargs(Integer... i) {
		System.out.println("wideningBeatsVarargs(Integer...)");
	}

	// Auto-Boxing where Boxing beats Varargs
	static void boxingBeatsVarargs(Integer i) {
		System.out.println("boxingBeatsVarargs(Integer)");
	}

	static void boxingBeatsVarargs(Integer... i) {
		System.out.println("boxingBeatsVarargs(Integer...)");
	}

	// Method Overloading with Widening and Boxing
	static void methodOverloadingWideningAndBoxing(Long l) {
		System.out.println("methodOverloadingWideningAndBoxing(Long)");
	}

}
