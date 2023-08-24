package app.javapandit.java7.varargs;

import java.util.ArrayList;
import java.util.List;

public class SafeVarargsExample {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@SafeVarargs
	private final void print(List... topics) {

		for (List<String> topicList : topics) {
			System.out.println("Topic List: " + topicList);
		}
	}

	public static void main(String[] args) {
		SafeVarargsExample safeVarargs = new SafeVarargsExample();
		List<String> list = new ArrayList<String>();
		list.add("OOPS");
		list.add("IO");
		list.add("COLLECTION");
		list.add("EXCEPTION");

		safeVarargs.print(list);
	}

}