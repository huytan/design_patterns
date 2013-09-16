package exercise.two;

import java.util.Vector;

public class FrameSet implements IComponent {
	String name;
	String css;
	Vector<IComponent> listComponent = new Vector<IComponent>();

	public FrameSet(String name, String css) {
		this.name = name;
		this.css = css;
	}

	public void addComponent(IComponent c) {
		listComponent.add(c);
	}

	public void removeComponent(IComponent c) {
		listComponent.remove(c);
	}

	@Override
	public void getSourceFiles(int depth) {
		int _depth = depth;
		String spaces = "";
		while (_depth-- > 0) {
			spaces += " ";
		}
		System.out.println(String.format("%s<%s %s>", spaces, name, css));
		for (IComponent c : listComponent) {
			c.getSourceFiles(depth + 4);
		}
		System.out.println(String.format("%s</%s>", spaces, name));
	}

}
