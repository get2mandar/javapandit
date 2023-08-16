package app.javapandit.java5.generics;

public class JavaGenerics_CustomClass_Example {

	public static void main(String[] args) {

		// Initialize Generic Class with Integer data
		CustomGenericsClass<Integer> intObj = new CustomGenericsClass<Integer>(5);
		System.out.println("Generic Class returns: " + intObj.getData());

		// Initialize Generic Class with String data
		CustomGenericsClass<String> stringObj = new CustomGenericsClass<String>("Java Programming");
		System.out.println("Generic Class returns: " + stringObj.getData());
	}

}

// Create Custom Generic Class
class CustomGenericsClass<T> {

	// Variable of T type
	private T data;

	public CustomGenericsClass(T data) {
		this.data = data;
	}

	// Method returns T type variable
	public T getData() {
		return this.data;
	}
}