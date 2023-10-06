package app.javapandit.java8.interfaces.defaultmethods;

interface Readable {

	// Default Method
	default void defaultMessage() {
		System.out.println("MultiInterface Default Message from Readable");
	}

}