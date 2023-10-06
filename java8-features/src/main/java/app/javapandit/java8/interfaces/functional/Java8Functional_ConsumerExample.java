package app.javapandit.java8.interfaces.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java8Functional_ConsumerExample {

	public static void main(String[] args) {

		// Create Consumer to Display Number
		Consumer<Integer> display = a -> System.out.println("Display Number: " + a + "\n");

		// Implement Consumer display using accept()
		display.accept(10);

		// Consumer to Double Value of Each Item in List
		Consumer<List<Integer>> doubled = list -> {
			System.out.println("Source List To Double: " + list);
			for (int index = 0; index < list.size(); index++)
				list.set(index, 2 * list.get(index));
		};

		// Consumer to Display List of Numbers
		Consumer<List<Integer>> displayList = list -> list.stream().forEach(a -> System.out.println("- " + a));

		// Implement Consumer doubled using accept()
		List<Integer> srcList = Arrays.asList(1, 2, 3, 4);
		System.out.println("Implement Consumer doubled using accept() - doubled.accept(srcList)");
		doubled.accept(srcList);

		// Implement Consumer displayList using accept()
		System.out.println("\nImplement Consumer displayList using accept() - displayList.accept(srcList)");
		displayList.accept(srcList);

		System.out.println("\n---------\nUsing andThen() for Multiple Consumer Implementation Together");
		System.out.println("doubled.andThen(displayList).accept(srcList)\n");
		doubled.andThen(displayList).accept(srcList);
	}

}