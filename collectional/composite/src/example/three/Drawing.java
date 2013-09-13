package example.three;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Drawing implements Shape {
	private List<Shape> shapes = new ArrayList<Shape>();

	@Override
	public void draw(String fillColor) {
		for (Shape sh : shapes) {
			sh.draw(fillColor);
		}
	}

	// add shape to drawing
	public void add(Shape s) {
		this.shapes.add(s);
	}

	// removing shape from drawing
	public void remove(Shape s) {
		this.shapes.remove(s);
	}

	public void clear() {
		System.out.println();
		System.out.println("Clearing all the shapes from drawing");
		System.out.println();
		this.shapes.clear();
	}
}
