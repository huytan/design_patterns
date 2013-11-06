package example.two.impl;

import example.two.Element;
import example.two.Visitor;

public class Car implements Element {
	private Engine engine = new Engine();
	private Body body = new Body();
	private Wheel[] wheels = { new Wheel("front left"),
			new Wheel("front right"), new Wheel("back left"),
			new Wheel("back right") };

	@Override
	public void accept(Visitor v) {
		v.visit(this);
		engine.accept(v);
		body.accept(v);
		for (int i = 0; i < wheels.length; ++i)
			wheels[i].accept(v);
	}

}
