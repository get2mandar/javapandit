package app.javapandit.java8.interfaces.optional;

import java.util.Optional;

public class Java8_CreateOptionalObjectsExample {

	public static void main(String[] args) {

		// Creating Optional Objects
		System.out.println("Creating Optional Objects\n");

		Optional<String> empty = Optional.empty();
		System.out.println("empty = Optional.empty():\nempty.isPresent(): " + empty.isPresent());

		System.out.println("---------\n");

		String someText = "Some Non-Empty Text";
		Optional<String> text = Optional.of(someText);
		System.out.println("text = Optional.of(someText):\ntext.isPresent(): " + text.isPresent());

		System.out.println("---------\n");

		String nullString = null;
		try {
			Optional.of(nullString);
		} catch (Exception ex) {
			System.out.println("Optional.of(nullString): " + ex);
		}

		System.out.println("---------\n");

		Optional<String> textCheckNullable = Optional.ofNullable(someText);
		System.out.println("textCheckNullable = Optional.ofNullable(someText):\ntextCheckNullable.isPresent(): "
				+ textCheckNullable.isPresent());

		System.out.println("---------\n");

		Optional<String> nullCheckNullable = Optional.ofNullable(nullString);
		System.out.println("nullCheckNullable = Optional.ofNullable(nullString):\nnullCheckNullable.isPresent(): "
				+ nullCheckNullable.isPresent());
	}
}