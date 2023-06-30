package app.javapandit.java1.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class JavaReflection_IntrospectionOnlyExample {

	// Main Method
	public static void main(String[] args) {
		try {

			/** Employee Object **/

			// Create Object of Employee
			Employee emp = new Employee();

			// Create Object of Class using Employee Object
			Class empClass = emp.getClass();

			// Get Name of the Class
			printName(empClass);

			// Get Access Modifier of Class
			printModifier(empClass);

			// Get Super Class Name
			printSuperClassName(empClass);
			seperator();

			/** Student Object **/

			// Create Object of Student
			Student std = new Student();

			// Create Object of Class using Student Object
			Class stdClass = std.getClass();

			// Get Name of the Class
			printName(stdClass);

			// Get Access Modifier of Class
			printModifier(stdClass);

			// Get Super Class Name
			printSuperClassName(stdClass);
			seperator();

			// Employee Object Methods
			printDeclaredMethods(empClass);
			seperator();

			// Student Object Methods
			printDeclaredMethods(stdClass);
			seperator();

			// Get Access Modifier of Employee Class Salary Field
			printFieldModifier(empClass, "salary");
			seperator();

			// Get Constructors of Employee Class
			printDeclaredConstructors(empClass);

		} catch (Exception ex) {
			System.err.println("Exception: " + ex.getMessage());
		}
	}

	private static void printName(Class cls) {
		String clsName = cls.getName();
		System.out.println("Class Name: " + clsName);
	}

	private static void printModifier(Class cls) {
		int mod = cls.getModifiers();
		String modifier = Modifier.toString(mod);
		System.out.println("Modifier: " + modifier);
	}

	private static void printSuperClassName(Class cls) {
		Class superCls = cls.getSuperclass();
		System.out.println("Super Class Name: " + superCls.getName());
	}

	private static void seperator() {
		System.out.println(" - - - - - - - - ");
	}

	private static void printDeclaredMethods(Class cls) {
		System.out.println("Methods Of Class: " + cls.getName());
		Method[] methods = cls.getDeclaredMethods();

		for (short index = 0; index < methods.length; index++) {
			Method m = methods[index];

			System.out.println("Method Index: [" + index + "]");

			// get names of methods
			System.out.println("\tMethod Name: " + m.getName());

			// get the access modifier of methods
			int modifier = m.getModifiers();
			System.out.println("\tMethod Modifier: " + Modifier.toString(modifier));

			// get the return types of method
			System.out.println("\tMethod Return Types: " + m.getReturnType());
			System.out.println("\t - - - ");
		}
	}

	private static void printFieldModifier(Class cls, String fieldName) throws Exception {
		System.out.println("Field Of Class: " + cls.getName());
		Field field = cls.getField(fieldName);
		System.out.println("Field Name: " + field.getName());

		int mod = field.getModifiers();
		String modifier = Modifier.toString(mod);
		System.out.println("Field Modifier: " + modifier);
	}

	private static void printDeclaredConstructors(Class cls) {
		System.out.println("Constructors Of Class: " + cls.getName());
		// Get All Constructors of Class
		Constructor[] constructors = cls.getDeclaredConstructors();

		for (short index = 0; index < constructors.length; index++) {
			Constructor cons = constructors[index];

			System.out.println("Constructor Index: [" + index + "]");

			// Get Name of Constructor
			System.out.println("\tConstructor Name: " + cons.getName());

			// Get the Access Modifier of Constructor
			int modifier = cons.getModifiers();
			String mod = Modifier.toString(modifier);
			System.out.println("\tConstructor Modifier: " + mod);
			System.out.println("\t - - - ");
		}

	}

}