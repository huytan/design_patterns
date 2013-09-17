package exercise.two;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;

import com.sun.org.apache.bcel.internal.generic.ATHROW;

public class SaxParseXML extends DefaultHandler {
	private Author acct;
	private String temp;
	private ArrayList<Author> accList = new ArrayList<Author>();
	private ArrayList<Author> accBook = new ArrayList<Author>();

	public Vector parse(String xmlFile) throws IOException {
		Vector data = null;
		try {
			// Create a "parser factory" for creating SAX parsers
			SAXParserFactory spfac = SAXParserFactory.newInstance();

			// Now use the parser factory to create a SAXParser object
			SAXParser sp = spfac.newSAXParser();

			// Create an instance of this class; it defines all the handler
			// methods
			SaxParseXML handler = new SaxParseXML();
			// Finally, tell the parser to parse the input and notify the
			// handler
			sp.parse(xmlFile, handler);
			data = handler.readList();
			return data;
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}

	/*
	 * When the parser encounters plain text (not XML elements), it calls(this
	 * method, which accumulates them in a string buffer
	 */
	public void characters(char[] buffer, int start, int length) {
		temp = new String(buffer, start, length);
	}

	/*
	 * Every time the parser encounters the beginning of a new element, it calls
	 * this method, which resets the string buffer
	 */
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		temp = "";
		if (qName.equalsIgnoreCase("Author")) {
			acct = new Author();
		}
	}

	/*
	 * When the parser encounters the end of an element, it calls this method
	 */
	public void endElement(String uri, String localName, String qName)
			throws SAXException {

		if (qName.equalsIgnoreCase("Author")) {
			// add it to the list
			accList.add(acct);

		} else if (qName.equalsIgnoreCase("Name")) {
			acct.setNameAuthor(temp);
		} else if (qName.equalsIgnoreCase("Title")) {
			acct.setBookTitle(temp);
		}

	}

	public Vector readList() {
		Vector v = new Vector();
		System.out.println("No of  the accounts in bank '" + accList.size()
				+ "'.");

		Iterator it = accList.iterator();
		while (it.hasNext()) {
			v.add(it.next());
		}
		return v;
	}
}
