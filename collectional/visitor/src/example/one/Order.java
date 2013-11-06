package example.one;

import example.one.impl.OrderVisitor;

public interface Order {
	public void accept(OrderVisitor v);
}
