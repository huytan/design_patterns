package exercise.three;

import java.util.Enumeration;
import java.util.Vector;

import example.one_abstract.CompositeException;
import example.one_abstract.FileSystemComponent;

public class PCategory extends ProductSystemComponent {

	Vector listComponent = new Vector();

	public PCategory(String name) {
		super(name);
	}

	@Override
	public double getDollarComponent() {
		double dollar = 0;
		Enumeration e = listComponent.elements();
		while (e.hasMoreElements()) {
			ProductSystemComponent component = (ProductSystemComponent) e
					.nextElement();
			dollar = dollar + (component.getDollarComponent());

		}
		return dollar;
	}

	@Override
	void addComponent(ProductSystemComponent component)
			throws CompositeException {
		listComponent.add(component);
	}

	@Override
	public ProductSystemComponent getComponent(int location) throws Exception {
		// TODO Auto-generated method stub
		return (ProductSystemComponent) listComponent.elementAt(location);
	}

}
