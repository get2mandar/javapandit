package app.javapandit.java5.generics;

import java.util.ArrayList;
import java.util.List;

public class JavaGenerics_TypeSafety_Example {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(1000); // Valid Value insertion

		// list.add("hundred"); // Compile time Error
	}

}
