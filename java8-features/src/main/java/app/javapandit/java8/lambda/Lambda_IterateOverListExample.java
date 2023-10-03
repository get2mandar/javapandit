package app.javapandit.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda_IterateOverListExample {

	public static void main(String[] args) {
		List<String> pointList = new ArrayList<String>();

		pointList.add("1");
		pointList.add("2");

		System.out.println("pointList.forEach: ");
		pointList.forEach(p -> {
			System.out.println(p);
		});
	}

}