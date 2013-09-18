package example.two;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class MyRectangle implements MyShape {
	private String label;

	public MyRectangle(String label) {
		this.label = label;

	}

	@Override
	public void draw(Graphics rectangle, int x, int y, int width, int height,
			Color color, boolean fill, String font) {
		rectangle.setColor(color);
		rectangle.drawRect(x, y, width, height);
		rectangle.setFont(new Font(font, 12, 12));
		rectangle.drawString(label, x + (width / 2), y);
		if (fill) {
			rectangle.fillRect(x, y, width, height);
		}
	}
}
