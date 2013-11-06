package example.two.impl;

import example.two.Element;
import example.two.Visitor;

public class Engine implements Element {

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}
