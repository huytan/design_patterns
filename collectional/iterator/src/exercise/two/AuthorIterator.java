package exercise.two;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class AuthorIterator implements Iterator {
	Enumeration ec;
	String type;
	Author nextAuthor;

	public AuthorIterator(AuthorCollection ac, String type) {
		this.ec = ac.getAllAuthors();
		this.type = type;
	}

	@Override
	public boolean hasNext() {
		boolean matchFound = false;
		while (ec.hasMoreElements()) {
			Author tempObj = (Author) ec.nextElement();
			if (tempObj.getNameAuthor().equals(type)) {
				matchFound = true;
				nextAuthor = tempObj;
				break;
			}
			if (matchFound != true) {
				nextAuthor = null;
			}
		}
		return matchFound;
	}

	@Override
	public Object next() {
		if (nextAuthor == null) {
			throw new NoSuchElementException();
		} else {
			return nextAuthor;
		}
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

}
