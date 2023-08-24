package app.javapandit.java5.enhancedfor;

import java.util.Arrays;
import java.util.List;

public class Java_EnhancedForLoopExample {

	public static void main(String[] args) {

		// Enhanced For Look with Array
		System.out.println("Enhanced For Look with Array:");
		int[] numArray = { 10, 20, 30, 40 };
		for (int item : numArray) {
			System.out.println(item);
		}
		System.out.println();

		// Enhanced For Look with List
		System.out.println("Enhanced For Look with List:");
		List<String> list = Arrays.asList("A", "B", "C");

		for (String item : list) {
			System.out.println(item);
		}
	}

}
