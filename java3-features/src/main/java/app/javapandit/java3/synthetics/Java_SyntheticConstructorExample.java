package app.javapandit.java3.synthetics;

import java.lang.reflect.Constructor;

public class Java_SyntheticConstructorExample {

	@SuppressWarnings("unused")
	private NestedClass nestedClass = new NestedClass();

	class NestedClass {
		private NestedClass() {
		}
	}

	public static void main(String[] args) {

		int syntheticConstructors = 0;
		Constructor<?>[] constructors = Java_SyntheticConstructorExample.NestedClass.class.getDeclaredConstructors();

		System.out.println("Class contains only two Constructors: " + constructors.length);

		for (Constructor<?> constr : constructors) {
			System.out.println("Constructor: " + constr.getName() + ", isSynthetic: " + constr.isSynthetic());

			if (constr.isSynthetic()) {
				syntheticConstructors++;
			}
		}

		System.out.println("Synthetic Constructors in Class: " + syntheticConstructors);

	}

}
