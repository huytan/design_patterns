package example.four.composite;

public interface Shape {
	/*
	 * Draw shape on screen
	 * 
	 * Method that must be implemented by Basic as well as complex shapes
	 */
	public void renderShapeToScreen();

	/*
	 * Making a complex shape explode results in getting a list of the shapes
	 * forming this shape
	 * 
	 * For example if a rectangle explodes it results in 4 line objects Making a
	 * simple shape explode results in returning the shap itself
	 */
	public Shape[] explodeShape();
	/**
	 * 
	 * Although this method applies to composites only 
	 * it has been added to interface to enhance uniformity 
	 *  
	 * @param shape
	 */
	public void addToShape(Shape shape);
}
