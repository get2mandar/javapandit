package app.javapandit.java8.interfaces.optional;

import java.util.Optional;

public class Java8_CheckingValueOfOptionalExample {

	public static void main(String[] args) {

		// Checking Value Presence: isPresent()
		System.out.println("Checking Value Presence: isPresent()\n");

		String someText = "Some Non-Empty Text";
		Optional<String> text = Optional.of(someText);
		System.out.println("text = Optional.of(someText):\ntext.isPresent(): " + text.isPresent());

		Optional<String> nullCheck = Optional.ofNullable(null);
		System.out.println("\nnullCheck = Optional.ofNullable(null):\nnullCheck.isPresent(): " + nullCheck.isPresent());

		System.out.println("---------\n");

		// Conditional Action With ifPresent()
		System.out.println("Conditional Action With ifPresent()");

		System.out.print("Prior to Optional and ifPresent(): ");
		if (someText != null) {
			System.out.print(someText.length());
		}

		System.out.print("\nWith Optional and ifPresent(): ");
		text.ifPresent(txt -> System.out.println(txt.length()));

		System.out.println("---------\n");

		// Default Value With orElse()
		System.out.println("Default Value With orElse()");

		String nullName = null;
		String name = Optional.ofNullable(nullName).orElse("Alex");

		System.out.println("name = Optional.ofNullable(nullName).orElse(\"Alex\"): name = '" + name + "'");

		System.out.println("---------\n");

		// Default Value With orElseGet()
		System.out.println("Default Value With orElseGet()");
		name = Optional.ofNullable(nullName).orElseGet(() -> "Alex");

		System.out.println("name = Optional.ofNullable(nullName).orElseGet(() -> \"Alex\"): name = '" + name + "'");

		System.out.println("---------\n");

		// Exceptions With orElseThrow()
		System.out.println("Exceptions With orElseThrow()");

		System.out.println("name = Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new)");
		try {
			name = Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		System.out.println("---------\n");

		// Returning Value With get()
		System.out.println("Returning Value With get()");
		String textString = text.get();

		System.out.println("textString = text.get(): " + textString);

		System.out.println("---------\n");
	}
}