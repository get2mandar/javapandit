package app.javapandit.java8.interfaces.defaultmethods;

public class Java8_DefaultMethodsExample implements Writable, Readable {

	@Override
	public void writeCustomMessage(String message) {
		System.out.println("Custom Message: " + message);
	}

	@Override
	public void defaultMessage() {
		System.out.println("\n---------\nOverride MultiInterface defaultMessage Method::");
		Writable.super.defaultMessage();
		Readable.super.defaultMessage();
	}

	public static void main(String[] args) {
		Java8_DefaultMethodsExample example = new Java8_DefaultMethodsExample();

		example.writeCustomMessage(Writable.class.getSimpleName() + " Implementor");

		example.writeDefaultMessage();

		Writable.writeStaticMessage();

		example.defaultMessage();
	}
}