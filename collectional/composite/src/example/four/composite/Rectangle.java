package example.four.composite;

/**
 * Rectangle is a composite
 * 
 * Complex Shape
 */
public class Rectangle implements Shape {
	// List of shapes forming the rectangle
	// rectangle is centered around origin
	Shape[] rectangleEdges = { new Line(-1, -1, 1, -1), new Line(-1, 1, 1, 1),
			new Line(-1, -1, -1, 1), new Line(1, -1, 1, 1) };

	@Override
	public void renderShapeToScreen() {
		for (Shape s : rectangleEdges) {

			// delegate to child objects
			s.renderShapeToScreen();

		}
	}

	@Override
	public Shape[] explodeShape() {

		return rectangleEdges;
	}

	/**
	 * Implementation of the add to shape method
	 * 
	 * @param shape
	 */
	public void addToShape(Shape shape) {

		throw new RuntimeException("Cannot add a shape to simple shapes ...");
	}

}
