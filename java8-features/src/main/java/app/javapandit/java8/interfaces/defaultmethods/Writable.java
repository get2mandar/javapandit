package app.javapandit.java8.interfaces.defaultmethods;

interface Writable {

	// Abstract Method
	public void writeCustomMessage(String message);

	// Default Methods
	default void writeDefaultMessage() {
		System.out.println("Default Message from Writable");
	}

	default void defaultMessage() {
		System.out.println("MultiInterface Default Message from Writable");
	}

	// Static Method
	static void writeStaticMessage() {
		System.out.println("Static Message from Writable");
	}
}