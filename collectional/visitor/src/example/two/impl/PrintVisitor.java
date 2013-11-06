package example.two.impl;

import example.two.Visitor;

public class PrintVisitor implements Visitor {

	@Override
	public void visit(Wheel w) {
		System.out.println("Visiting: " + w.getName());
	}

	@Override
	public void visit(Car c) {
		System.out.println("Visitng engene");
	}

	@Override
	public void visit(Body d) {
		System.out.println("Visitng body");
	}

	@Override
	public void visit(Engine e) {
		System.out.println("Visitng car");
	}

}
