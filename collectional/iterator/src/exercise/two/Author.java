package exercise.two;

import java.util.ArrayList;
import java.util.List;

public class Author {
	private String nameAuthor;
	private List<String> bookTitle = new ArrayList<String>();

	public Author() {
	}

	public String getNameAuthor() {
		return nameAuthor;
	}

	public void setNameAuthor(String nameAuthor) {
		this.nameAuthor = nameAuthor;
	}

	public List<String> getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle.add(bookTitle);
	}

	public Author(String nameAuthor, List<String> bookTitle) {
		super();
		this.nameAuthor = nameAuthor;
		this.bookTitle = bookTitle;
	}

}
