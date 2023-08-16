package app.javapandit.java5.generics;

import java.util.ArrayList;
import java.util.List;

public class JavaGenerics_LowerBoundWildcard_Example {

	public static void main(String[] args) {

		// List of Grand Children
		List<GenericsGrandChildClass> grandChildren = new ArrayList<GenericsGrandChildClass>();
		grandChildren.add(new GenericsGrandChildClass());
		addGrandChildren(grandChildren);

		// List of Children
		List<GenericsChildClass> childs = new ArrayList<GenericsChildClass>();
		childs.add(new GenericsChildClass());
		addGrandChildren(childs);

		// List of Super Parents
		List<GenericsSuperClass> supers = new ArrayList<GenericsSuperClass>();
		supers.add(new GenericsSuperClass());
		addGrandChildren(supers);
	}

	public static void addGrandChildren(List<? super GenericsGrandChildClass> grandChildren) {
		grandChildren.add(new GenericsGrandChildClass());
		System.out.println(grandChildren);
	}

}

class GenericsSuperClass {

	public String toString() {
		return this.getClass().getSimpleName();
	}
}

class GenericsChildClass extends GenericsSuperClass {

	public String toString() {
		return this.getClass().getSimpleName();
	}

}

class GenericsGrandChildClass extends GenericsChildClass {

	public String toString() {
		return this.getClass().getSimpleName();
	}

}