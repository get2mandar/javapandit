package app.javapandit.java8.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI_ParallelStreamsExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}
		// Here Creating a Parallel Stream
		Stream<Integer> stream = list.parallelStream();
		Integer[] evenNumbersArr = stream.filter(i -> i % 2 == 0).toArray(Integer[]::new);
		Arrays.stream(evenNumbersArr).forEach(p -> System.out.println(p));
	}
}