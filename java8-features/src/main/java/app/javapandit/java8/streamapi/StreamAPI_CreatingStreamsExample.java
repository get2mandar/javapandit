package app.javapandit.java8.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI_CreatingStreamsExample {

	public static void main(String[] args) {

		// Example: Stream.of()
		System.out.println("Example: Stream.of() --> Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)");
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		stream.forEach(p -> System.out.println(p));

		// Example: Stream.of(array)
		System.out.println("\nExample: Stream.of(array) --> Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 })");
		Stream<Integer> streamOfArr = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		streamOfArr.forEach(p -> System.out.println(p));

		// Example: List.stream()
		System.out.println("\nExample: List.stream() --> Stream<Integer> streamList = list.stream()");
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}
		Stream<Integer> streamList = list.stream();
		streamList.forEach(p -> System.out.println(p));

		// Example: Stream.generate() or Stream.iterate()
		System.out.println("\nExample: Stream.generate() --> Stream.generate(() -> (new Random()).nextInt(100))");
		Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100));
		randomNumbers.limit(20).forEach(System.out::println);

		// Example: Stream of String chars or tokens
		System.out.println("\nExample: Stream of String chars --> \"12345_abcdefg\".chars()");
		IntStream charsStream = "12345_abcdefg".chars();
		charsStream.forEach(p -> System.out.println(Character.toString((char) p)));

		System.out.println("\nExample: Stream of tokens --> Stream.of(\"A$B$C\".split(\"\\\\$\")");
		Stream<String> splitStream = Stream.of("A$B$C".split("\\$"));
		splitStream.forEach(p -> System.out.println(p));
	}

}