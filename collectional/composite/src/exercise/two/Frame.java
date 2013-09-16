package exercise.two;

public class Frame implements IComponent {
	String name;
	String css;

	public Frame(String name, String css) {
	
		this.name = name;
		this.css = css;
	}

	@Override
	public void getSourceFiles(int depth) {
		String spaces = "";
		while (depth-- > 0) {
			spaces += " ";
		}
		System.out.println(String.format("%s<%s %s>", spaces, name, css));
	}

}
