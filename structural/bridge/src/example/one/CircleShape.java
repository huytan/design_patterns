package example.one;

/** "Refined Abstraction" */
public class CircleShape implements Shape {
	private double x, y, radius;
	private DrawingAPI drawingAPI;

	public CircleShape(double x, double y, double radius, DrawingAPI drawingAPI) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.drawingAPI = drawingAPI;
	}

	// low-level i.e. Implementation specific
	@Override
	public void draw() {
		drawingAPI.drawCircle(x, y, radius);

	}

	// high-level i.e. Abstraction specific
	@Override
	public void resizeByPercentage(double pct) {
		radius *= pct;
	}

}
