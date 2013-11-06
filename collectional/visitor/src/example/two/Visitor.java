package example.two;

import example.two.impl.Body;
import example.two.impl.Car;
import example.two.impl.Engine;
import example.two.impl.Wheel;

public interface Visitor {
	public void visit(Wheel w);

	public void visit(Car c);

	public void visit(Body d);

	public void visit(Engine e);
}
