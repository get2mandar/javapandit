package app.javapandit.java8.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPI_StreamOperationsExample {

	public static void main(String[] args) {

		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amanda");
		memberNames.add("Simon");
		memberNames.add("Aida");
		memberNames.add("Reeve");
		memberNames.add("Sylvia");
		memberNames.add("Isabelle");
		memberNames.add("Yana");
		memberNames.add("Lois");

		// Example: Source List
		System.out.println("Example: Source List - memberNames");
		System.out.println("-------");
		System.out.println(memberNames);

		// Example: Intermediate Operations
		System.out.println("\n\nExample: Intermediate Operations");
		System.out.println("-------");

		// Example: Stream.filter()
		System.out.println("Stream.filter() --> filter((s) -> s.startsWith(\"A\")");
		memberNames.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);

		// Example: Stream.map()
		System.out.println("\nStream.map() --> filter((s) -> s.startsWith(\"S\")).map(String::toUpperCase)");
		memberNames.stream().filter((s) -> s.startsWith("S")).map(String::toUpperCase).forEach(System.out::println);

		// Example: Stream.sorted()
		System.out.println("\nStream.sorted() --> sorted()");
		memberNames.stream().sorted().forEach(System.out::println);

		System.out.println("\n");

		// Example: Terminal Operations
		System.out.println("Example: Terminal Operations");
		System.out.println("-------");

		// Example: Stream.forEach()
		System.out.println("Stream.forEach() --> forEach(System.out::println)");
		memberNames.forEach(System.out::println);

		// Example: Stream.collect()
		System.out.println("\nStream.collect() --> sorted().map(String::toUpperCase).collect(Collectors.toList())");
		List<String> memNamesInUppercase = memberNames.stream().sorted().map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.print(memNamesInUppercase);
		System.out.println("\n");

		// Example: Stream.match()
		System.out.println("Stream.match() --> anyMatch - allMatch - noneMatch");
		boolean matchedResult = memberNames.stream().anyMatch((s) -> s.startsWith("A"));
		System.out.println("anyMatch((s) -> s.startsWith(\"A\"): " + matchedResult); // true

		matchedResult = memberNames.stream().allMatch((s) -> s.startsWith("A"));
		System.out.println("allMatch((s) -> s.startsWith(\"A\"): " + matchedResult); // false

		matchedResult = memberNames.stream().noneMatch((s) -> s.startsWith("A"));
		System.out.println("noneMatch((s) -> s.startsWith(\"A\"): " + matchedResult); // false

		// Example: Stream.count()
		System.out.println("\nStream.count() --> count()");
		long totalMatched = memberNames.stream().filter((s) -> s.startsWith("A")).count();
		System.out.println(totalMatched); // 2

		// Example: Stream.reduce()
		System.out.println("\nStream.reduce() --> reduce((s1,s2) -> s1 + \"#\" + s2)");
		Optional<String> reduced = memberNames.stream().reduce((s1, s2) -> s1 + "#" + s2);
		reduced.ifPresent(System.out::println);

		System.out.println("\n");

		// Example: Short-Circuit Operations
		System.out.println("Example: Short-Circuit Operations");
		System.out.println("-------");

		// Example: Stream.anyMatch()
		System.out.println("Stream.match() --> anyMatch((s) -> s.startsWith(\"S\")");
		boolean matched = memberNames.stream().anyMatch((s) -> s.startsWith("S"));
		System.out.println(matched); // true

		// Example: Stream.findFirst()
		System.out.println("\nStream.findFirst() --> filter((s) -> s.startsWith(\"L\")).findFirst()");
		String firstMatchedName = memberNames.stream().filter((s) -> s.startsWith("L")).findFirst().get();
		System.out.println(firstMatchedName); // Lois
	}
}