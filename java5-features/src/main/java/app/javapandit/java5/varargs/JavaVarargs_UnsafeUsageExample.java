package app.javapandit.java5.varargs;

public class JavaVarargs_UnsafeUsageExample {

	public static void main(String[] args) {
		try {
			// Object[] and String[] cannot cast
			String[] stringAsIs = returnAsIs("One", "Two"); // ClassCaseException
			System.out.println(stringAsIs);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	static <T> T[] returnAsIs(T a, T b) {
		return toArray(a, b);
	}

	static <T> T[] toArray(T... arguments) {
		return arguments;
	}

}