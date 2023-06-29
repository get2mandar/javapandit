package app.javapandit.java1.innerclass;

public class MethodLocalInnerClass {

	// Java Program to Demonstrate Inner Class within a Method of Outer Class
	// Main Method
	public static void main(String[] args) {

		// Creating Object of Outer Class
		OuterHelperMethodLocal outer = new OuterHelperMethodLocal();

		// Calling outerMethod to call inner class method
		outer.outerMethod();
	}

}

// Class 1
// Outer Helper Class
class OuterHelperMethodLocal {

	// Method inside Outer Class
	void outerMethod() {

		System.out.println("Inside outerMethod()");

		// Class 2
		// Inner Class
		// It is Local to outerMethod()
		class InnerClass {

			// Method defined Inside Inner Class
			void innerMethod() {
				System.out.println("Inside innerMethod()");
			}
		}

		// Creating Object of Inner Class
		InnerClass in = new InnerClass();

		// Calling Method of Inner Class
		in.innerMethod();
	}
}