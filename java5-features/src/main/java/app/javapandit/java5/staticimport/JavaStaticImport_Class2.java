package app.javapandit.java5.staticimport;

public class JavaStaticImport_Class2 {

	// Run This Example To See Current Class Static Member Takes Precedence

	public static void main(String[] args) {
		test(); // staticimport.Class2.test()
	}

	public static void test() {
		System.out.println("staticimport.Class2.test()");
	}

}
