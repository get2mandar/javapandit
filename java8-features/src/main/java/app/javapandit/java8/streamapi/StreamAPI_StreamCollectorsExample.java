package app.javapandit.java8.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI_StreamCollectorsExample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}

		// Example: Collect Stream Elements to a List
		System.out.println("Example: Collect Stream Elements to a List - Even Numbers List");
		Stream<Integer> listStream = list.stream();
		List<Integer> evenNumbersList = listStream.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.print(evenNumbersList);

		System.out.println("\n-------\n");

		// Example: Collect Stream Elements to an Array
		System.out.println("Example: Collect Stream Elements to an Array - Even Numbers Array");
		Stream<Integer> arrayStream = list.stream();
		Integer[] evenNumbersArr = arrayStream.filter(i -> i % 2 == 0).toArray(Integer[]::new);
		Arrays.stream(evenNumbersArr).forEach(p -> System.out.println(p));
	}
}