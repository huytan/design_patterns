package exercise.two;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import example.two_external.CertifiedCandidates;
import exercise.one.LocationCandidates;

public class AuthorCollection {
	Vector data;

	public AuthorCollection() throws IOException {
		initialize();
	}

	private void initialize() throws IOException {
		data = new Vector();
		SaxParseXML util = new SaxParseXML();
		Vector dataLines = util.parse("Author.xml");
		for (int i = 0; i < dataLines.size(); i++) {
			// System.out.println(dataLines.elementAt(i));
			data.add(dataLines.elementAt(i));
		}
	}

	public Enumeration getAllAuthors() {
		return data.elements();
	}

	public Iterator getAuthor(String type) {
		return new AuthorIterator(this, type);
	}

	public Iterator getBook(String type) {
		return new BookIterator(this, type);
	}
}
