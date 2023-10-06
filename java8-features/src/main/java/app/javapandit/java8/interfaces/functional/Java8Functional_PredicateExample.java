package app.javapandit.java8.interfaces.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class Java8Functional_PredicateExample {

	public static void main(String[] args) {

		// Simple Predicate Example
		System.out.println("Simple Predicate Example:");

		// Create Predicate
		Predicate<Integer> lesserThan18 = index -> (index < 20);

		// Calling Predicate Method
		System.out.println("lesserThan18.test(10): " + lesserThan18.test(10));

		System.out.println("---------\n");

		// Predicate Chaining Example
		System.out.println("Predicate Chaining Example:");

		// Create Predicates
		Predicate<Integer> greaterThan10 = (index) -> index > 10;
		Predicate<Integer> lesserThan20 = (index) -> index < 20;

		// Calling Predicate Method
		boolean result = greaterThan10.and(lesserThan20).test(15);
		System.out.println("greaterThan10.and(lesserThan20).test(15): " + result);

		System.out.println("\nPredicate with negate() Example:");
		result = greaterThan10.and(lesserThan20).negate().test(15);
		System.out.println("greaterThan10.and(lesserThan20).negate().test(15): " + result);

		System.out.println("---------\n");

		// Predicate InTo Function Example
		System.out.println("Predicate InTo Function Example:");
		Predicate<Integer> greaterThan7 = (i) -> i > 7;
		predFunction(10, greaterThan7);

		System.out.println("---------\n");

		// Predicate OR Example
		System.out.println("Predicate OR Example:");
		Predicate<String> hasMinLengthOf10 = (stringValue) -> stringValue.length() > 10;
		Predicate<String> startsWithH = (stringValue) -> stringValue.startsWith("H");

		String hello = "Hello";
		boolean orResult = hasMinLengthOf10.or(startsWithH).test(hello);
		System.out.println("hasMinLengthOf10.or(startsWithH).test(hello): " + orResult);

		System.out.println("---------\n");

		// Predicate AND Example
		System.out.println("Predicate AND Example:");
		Predicate<String> nonNullPredicate = Objects::nonNull;

		String nullString = null;
		boolean andResultForNull = nonNullPredicate.and(hasMinLengthOf10).test(nullString);
		System.out.println("nonNullPredicate.and(hasMinLengthOf10).test(nullString): " + andResultForNull);

		String welcomeMessage = "Welcome to Java 8 Functional Programmaing.";
		boolean andResultWelcome = nonNullPredicate.and(hasMinLengthOf10).test(welcomeMessage);
		System.out.println("nonNullPredicate.and(hasMinLengthOf10).test(welcomeMessage): " + andResultWelcome);

		System.out.println("---------\n");

		// Predicate with Collection Example
		System.out.println("Predicate with Collection Example:");
		List<DummyUser> users = new ArrayList<DummyUser>();
		users.add(new DummyUser("Amanda", "member"));
		users.add(new DummyUser("Simon", "admin"));

		List<DummyUser> admins = subsetUsers(users, (DummyUser u) -> u.getRole().equals("admin"));
		System.out.println("subsetUsers(users, (DummyUser u) -> u.getRole().equals(\"admin\")):\n" + admins);

	}

	static void predFunction(int num, Predicate<Integer> predicate) {
		if (predicate.test(num)) {
			System.out.println("predFunction: Num " + num + " Pass Predicate Test");
		}
	}

	static List<DummyUser> subsetUsers(List<DummyUser> users, Predicate<DummyUser> predicate) {
		List<DummyUser> resultList = new ArrayList<DummyUser>();
		for (DummyUser user : users) {
			if (predicate.test(user))
				resultList.add(user);
		}
		return resultList;
	}
}

class DummyUser {

	String name, role;

	public DummyUser(String name, String role) {
		this.name = name;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

	@Override
	public String toString() {
		return "ExampleUser [name=" + name + ", role=" + role + "]";
	}
}