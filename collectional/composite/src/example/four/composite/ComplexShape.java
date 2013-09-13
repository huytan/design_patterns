package example.four.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite object supporting creation of more complex shapes Complex Shape
 */
public class ComplexShape implements Shape {
	/**
	 * List of shapes
	 */
	List<Shape> shapeList = new ArrayList<Shape>();

	/**
	 * 
	 */
	public void addToShape(Shape shapeToAddToCurrentShape) {

		shapeList.add(shapeToAddToCurrentShape);

	}

	@Override
	public void renderShapeToScreen() {
		for (Shape s : shapeList) {
			// use delegation to handle this method
			s.renderShapeToScreen();

		}
	}

	@Override
	public Shape[] explodeShape() {
		// TODO Auto-generated method stub
		return (Shape[]) shapeList.toArray();
	}

}
