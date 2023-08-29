package app.javapandit.java3.synthetics;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Java_SyntheticMethodExample {

	private static final class SynthMethodNestedClass {
		private String aNestedField = "A Nested Private Variable!";
	}

	public static void main(String[] args) {

		SynthMethodNestedClass nestedClass = new SynthMethodNestedClass();
		System.out.println("Nested Variable: " + nestedClass.aNestedField);

		Field[] fieldArray = nestedClass.getClass().getDeclaredFields();
		Method[] methodArray = nestedClass.getClass().getDeclaredMethods();

		System.out.println("\nField Array Length: " + fieldArray.length);

		for (Field field : fieldArray) {
			System.out.println("Field: " + field.getName() + "\nField isSynthetic: " + field.isSynthetic());
		}

		System.out.println("\nMethod Array Length: " + methodArray.length);

		for (Method method : methodArray) {
			System.out.println("Method: " + method + "\nMethod isSynthetic: " + method.isSynthetic());
		}
	}
}