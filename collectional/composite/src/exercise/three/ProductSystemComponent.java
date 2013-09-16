package exercise.three;

import example.one_abstract.CompositeException;

public abstract class ProductSystemComponent {
	String name;

	public ProductSystemComponent(String name) {
		this.name = name;
	}

	public abstract double getDollarComponent();

	public ProductSystemComponent getComponent(int location) throws Exception {
		throw new CompositeException("Incalid Operation. Not Supported");
	}

	void addComponent(ProductSystemComponent component)
			throws CompositeException {
		throw new CompositeException("Incalid Operation. Not Supported");
	}
}
