package example.one;

/** "Abstraction" */
public interface Shape {
	public void draw(); // low-level

	public void resizeByPercentage(double pct); // high-level
}
