package exercise.one;

import exercise.SystemComponent;

public class HTML extends SystemComponent {
	String name;

	public HTML(String sname) {
		super(sname);
		name = sname;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayURL(int depth) {
		String spaces = "";
		while (depth-- > 0) {
			spaces += "  ";
		}
		return spaces + name;
	}

}
