package example;

public interface Order {
	public void accept(OrderVisitor v);
}
