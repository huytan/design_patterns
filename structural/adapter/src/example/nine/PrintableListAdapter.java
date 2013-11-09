package example.nine;

import java.util.ArrayList;

//we have PrintableListAdapter class which will implement PrintableList interface and 
//will deal with our adaptee class.

public class PrintableListAdapter implements PrintableList {

	@Override
	public void printList(ArrayList<String> list) {
		// Converting ArrayList<String> to String so that we can pass String to
		// adaptee class
		String listString = "";

		for (String s : list) {
			listString += s + "\t";
		}

		// instantiating adaptee class
		PrintString printString = new PrintString();
		printString.print(listString);

	}
}
