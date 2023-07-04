package app.javapandit.java2.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class JavaCollection_MapInterface {

	// Main Method
	public static void main(String[] args) {

		// Declaring Hash Map
		demonstrateMapInterface(new HashMap());

		// Declaring Tree Map
		demonstrateMapInterface(new TreeMap());

		// Declaring Hash Table
		demonstrateMapInterface(new Hashtable());

	}

	private static void demonstrateMapInterface(Map map) {
		System.out.println("Map Implementation: " + map.getClass().getName());

		// Appending Elements in List
		for (int i = 1; i <= 5; i++)
			map.put("" + i, "" + (i * 100));

		// Printing Elements
		System.out.println(map);

		// Traversing Through the Map Elements One by One
		Iterator itr = map.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry mapEntry = (Entry) itr.next();
			System.out.println(mapEntry.getKey() + " - " + mapEntry.getValue());
		}

		System.out.println("- - - - -");
	}

}
