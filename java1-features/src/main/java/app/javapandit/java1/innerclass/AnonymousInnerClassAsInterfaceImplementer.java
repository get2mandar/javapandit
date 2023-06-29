package app.javapandit.java1.innerclass;

public class AnonymousInnerClassAsInterfaceImplementer {

	// Java Program to Demonstrate Anonymous Inner Class
	// Without any Name As an implementer of Interface

	// An Anonymous Inner Class by implementing Interface
	static DemoHelperInterface demo = new DemoHelperInterface() {

		// Method 1
		// show() Method inside Main Class
		public void show() {
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

// Helper Interface
interface DemoHelperInterface {

	// Method defined inside interface
	void show();
}