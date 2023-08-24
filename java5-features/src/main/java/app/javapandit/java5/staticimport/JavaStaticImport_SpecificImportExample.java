package app.javapandit.java5.staticimport;

import static app.javapandit.java5.staticimport.JavaStaticImport_Class1.test;
import static app.javapandit.java5.staticimport.JavaStaticImport_Class2.*;

// import static app.javapandit.java5.staticimport.JavaStaticImport_Class2.test;
// Last Import Class2.test will create an error: The method test() is ambiguous

@SuppressWarnings("unused")
public class JavaStaticImport_SpecificImportExample {

	// Run this Example to see:
	// Specifically Imported Member Precedes Wildcard Imported Member

	public static void main(String[] args) {

		test(); // Class1 test() method will be called
	}

}
