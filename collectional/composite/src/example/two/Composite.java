package example.two;

import java.util.LinkedList;

public class Composite implements IComponent {
	private final String _name;
	private final LinkedList<IComponent> _components;

	public Composite(String name) {
		super();
		_name = name;
		_components = new LinkedList();
	}

	public void addComponent(IComponent component) {
		_components.add(component);
	}

	public void removeComponenet(IComponent component) {
		_components.remove(component);
	}

	@Override
	public void print(int depth) {
		int _depth = depth;
		String spaces = "";
		while (_depth-- > 0) {
			spaces += " ";
		}

		System.out.println(String.format("%s<%s>", spaces, _name));

		for (IComponent c : _components) {
			c.print(depth + 4);
		}

		System.out.println(String.format("%s</%s>", spaces, _name));
	}

}
