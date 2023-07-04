package app.javapandit.java2.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class JavaCollection_ListInterface {

	// Main Method
	public static void main(String[] args) {

		// Declaring Array List
		demonstrateListInterface(new ArrayList());

		// Declaring Linked List
		demonstrateListInterface(new LinkedList());

		// Declaring Vector
		demonstrateListInterface(new Vector());

		// Declaring Stack
		demonstrateStack(new Stack());

	}

	private static void demonstrateListInterface(List list) {
		System.out.println("List Implementation: " + list.getClass().getName());

		// Appending Elements in List
		for (int i = 1; i <= 5; i++)
			list.add("" + i);

		// Printing Elements
		System.out.println(list);

		// Remove Element at Index 3
		list.remove(3);

		// Displaying the ArrayList After Deletion
		System.out.println(list);

		// Printing Elements One by One
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");

		System.out.println("\n- - - - -");
	}

	private static void demonstrateStack(Stack stack) {
		System.out.println("List Implementation: " + stack.getClass().getName());

		// Push Elements in Stack
		for (int i = 1; i <= 5; i++)
			stack.push("" + i);

		// Iterator for the Stack
		Iterator itr = stack.iterator();

		// Printing the Stack
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println();

		stack.pop();

		// Iterator for the Stack
		itr = stack.iterator();

		// Printing the Stack Again
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
}