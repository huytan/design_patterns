package example.nine;

import java.util.ArrayList;

public class AdapterDesignPatternMain {

	/**
	 * http://javapostsforlearning.blogspot.com/2012/09/adapter-design-pattern-in-java.html
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		PrintableList pl = new PrintableListAdapter();
		pl.printList(list);

	}
}
