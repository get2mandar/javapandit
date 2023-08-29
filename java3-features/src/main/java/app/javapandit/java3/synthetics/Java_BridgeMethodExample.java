package app.javapandit.java3.synthetics;

import java.lang.reflect.Method;

public class Java_BridgeMethodExample {

	public static void main(String[] args) {

		int syntheticMethods = 0;
		Method[] methodArray = BridgeMethodComparator.class.getDeclaredMethods();
		for (Method method : methodArray) {
			System.out.println("\nMethod: " + method + ", isSynthetic: " + method.isSynthetic() + ", isBridge: "
					+ method.isBridge());
			if (method.isSynthetic()) {
				syntheticMethods++;
				System.out.println("Synthetic Method in this Class is also a Bridge Method: " + method.isBridge());
			}
		}
		System.out.println("Total Synthetic Bridge Methods in the Class: " + syntheticMethods);

	}
}