package example.two;

public class Leaf implements IComponent {
	private final String _name;
	private final String _innerText;

	public Leaf(String _name, String _innerText) {
		super();
		this._name = _name;
		this._innerText = _innerText;
	}

	@Override
	public void print(int depth) {
		String spaces = "";
		while (depth-- > 0) {
			spaces += " ";
		}
		System.out.println(String.format("%s<%s>", spaces, _name));
		System.out.println(String.format("%s		%s", spaces, _innerText));
		System.out.println(String.format("%s</%s>", spaces, _name));

	}

}
