package app.javapandit.java5.varargs;

public class JavaVarargs_Example {

	public static void main(String[] args) {

		// Examples For Format String without use of Varargs
		System.out.println("Examples For Format String without use of Varargs");
		System.out.println("- - - - - - - - -");
		System.out.println(format());
		System.out.println(format("ValueOne"));
		System.out.println(format("ValueOne", "ValueTwo"));

		// Examples For Format String with use of Varargs
		System.out.println("Examples For Format String with use of Varargs");
		System.out.println("- - - - - - - - -");
		System.out.println("\n- " + formatWithVarArgs());
		System.out.println("\n- " + formatWithVarArgs("ValueOne"));
		System.out.println("\n- " + formatWithVarArgs("ValueOne", "ValueTwo"));
		System.out.println("\n- " + formatWithVarArgs("V1", "V2", "V3", "V4", "V5"));
	}

	private static String format() {
		return "No String Value to Format";
	}

	private static String format(String value) {
		return "Formatted String : " + ((value != null) ? value.trim() : null);
	}

	private static String format(String val1, String val2) {
		return "Formatted String(s) : " + ((val1 != null) ? val1.trim() : null) + " | "
				+ ((val2 != null) ? val2.trim() : null);
	}

	private static String formatWithVarArgs(String... values) {

		System.out.print("Values: ");
		for (String str : values)
			System.out.print(str + " ");

		return "Number of Args: " + values.length;
	}

}