package example.two.impl;

import example.two.Element;
import example.two.Visitor;

public class Wheel implements Element {
	private String name;

	public Wheel(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}
