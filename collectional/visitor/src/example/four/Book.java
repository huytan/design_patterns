package example.four;

public class Book implements ItemElement {
	private int price;
	private String isbnNumber;

	public Book(int price, String isbnNumber) {
		// TODO Auto-generated constructor stub
		this.price = price;
		this.isbnNumber = isbnNumber;
	}

	public int getPrice() {
		return price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}
}
