package app.javapandit.java1.innerclass;

public class AnonymousInnerClassAsSubclass {

	// Java Program to Demonstrate Anonymous Inner Class
	// Without any Name As a Subclass

	// An Anonymous Inner Class using DemoHelper
	static DemoHelper demo = new DemoHelper() {

		// Method 1
		// show() Method
		void show() {

			// Calling method show() via super from Parent Class
			super.show();

			System.out.println("In Anonymous Class");
		}
	};

	// Method 2
	// Main Method
	public static void main(String[] args) {

		// Calling show() Method Inside main() Method
		demo.show();
	}

}

// Class 1
// Helper Class
class DemoHelper {

	// Method of helper class
	void show() {
		System.out.println("In show() Method of Super Class - DemoHelper");
	}
}