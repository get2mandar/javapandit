package app.javapandit.java2.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class JavaCollection_SetInterface {

	// Main Method
	public static void main(String[] args) {

		// Declaring Hash Set
		demonstrateSetInterface(new HashSet());

		// Declaring Sorted Set - Tree Set
		demonstrateSetInterface(new TreeSet());

	}

	private static void demonstrateSetInterface(Set set) {
		System.out.println("Set Implementation: " + set.getClass().getName());

		// Appending Elements in List
		for (int i = 1; i <= 5; i++)
			set.add("" + i);

		// Printing Elements
		System.out.println(set);

		// Traversing Elements One by One
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println("\n- - - - -");
	}
}