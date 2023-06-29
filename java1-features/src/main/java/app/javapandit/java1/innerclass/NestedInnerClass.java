package app.javapandit.java1.innerclass;

public class NestedInnerClass {

	// Java Program to Demonstrate Nested Inner Class
	// Main Method
	public static void main(String[] args) {

		// Note how Inner Class Object is Created inside main()
		OuterHelperNested.InnerClass in = new OuterHelperNested().new InnerClass();

		// Calling show() method over above object created
		in.show();
	}

}

// Class 1
// Outer Helper Class
class OuterHelperNested {

	// Class 2
	// Simple nested Inner Class
	class InnerClass {

		// show() method of Inner Class
		public void show() {
			System.out.println("In a Nested Class Method");
		}
	}
}