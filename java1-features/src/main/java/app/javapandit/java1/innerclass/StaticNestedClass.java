package app.javapandit.java1.innerclass;

public class StaticNestedClass {

	// Java Program to Demonstrate Static Nested Classes
	// Main Method
	public static void main(String args[]) {

		// Calling method static display method rather than an instance of that Class
		OuterHelperStatic.InnerClass.display();
	}

}

// Class 1
// Outer Helper Class
class OuterHelperStatic {

	// Static Method inside Outer Class
	private static void outerMethod() {

		System.out.println("Inside outerMethod()");
	}

	// Class 2
	// Static Inner Class
	static class InnerClass {

		public static void display() {

			System.out.println("Inside Inner Class Method");

			// Calling method inside main() method
			outerMethod();
		}
	}
}
