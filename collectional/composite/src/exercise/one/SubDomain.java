package exercise.one;

import java.util.Enumeration;
import java.util.Vector;

import exercise.SystemComponent;

public class SubDomain extends SystemComponent {
	Vector components = new Vector();
	String sName;

	public SubDomain(String name) {
		super(name);
		sName = name;
		// components = new Vector();
	}

	@Override
	public String displayURL(int depth) {
		String name = sName;
		String spaces = "";
		while (depth-- > 0) {
			spaces += " ";
		}
		Enumeration e = components.elements();
		while (e.hasMoreElements()) {
			SystemComponent component = (SystemComponent) e.nextElement();
			name = name + "\n" + component.displayURL(depth + 2);
		}
		return String.format("%s%s", spaces, name);
	}

	public void addComponent(SystemComponent component) throws Exception {
		components.add(component);
	}

	public SystemComponent getComponent(int location) throws Exception {
		return (SystemComponent) components.elementAt(location);
	}
}
