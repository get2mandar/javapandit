package app.javapandit.java5.varargs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaVarargs_HeapPollutionExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		try {
			firstOfFirst(Arrays.asList("1", "2"), Arrays.asList("3", "4"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	static String firstOfFirst(List<String>... strings) {
		List<Integer> ints = Collections.singletonList(42);
		Object[] objects = strings;
		objects[0] = ints; // Heap Pollution

		return strings[0].get(0); // ClassCastException
	}

}