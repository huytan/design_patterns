package exercise.two;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookIterator implements Iterator {
	Enumeration ec;
	String type;
	Author nextAuthor;

	public BookIterator(AuthorCollection ac, String type) {
		this.ec = ac.getAllAuthors();
		this.type = type;
	}

	@Override
	public boolean hasNext() {
		boolean matchFound = false;
		while (ec.hasMoreElements()) {
			Author tempObj = (Author) ec.nextElement();
			for (int i = 0; i < tempObj.getBookTitle().size(); i++) {
				if (tempObj.getBookTitle().get(i).equals(type)) {
					matchFound = true;
					nextAuthor = tempObj;
					break;
				}
				if (matchFound != true) {
					nextAuthor = null;
				}
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
