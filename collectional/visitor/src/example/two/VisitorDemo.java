package example.two;

import example.two.impl.Body;
import example.two.impl.Car;
import example.two.impl.PrintVisitor;

public class VisitorDemo {
	public static void main(String[] args) {
		Car car = new Car();
		Visitor v = new PrintVisitor();
		car.accept(v);
		System.out.println("-------------");
		Body body = new Body();
		body.accept(v);

	}
}
