package example.three;

public class OrderDirector {
	OrderBuilder builder;

	public OrderDirector(OrderBuilder builder) {
		this.builder = builder;
	}

	public void build() {
		builder.addHeader();
		builder.addFooter();
	}

}
