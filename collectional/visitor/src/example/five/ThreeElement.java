package example.five;

public class ThreeElement implements NumberElement {

	int a;
	int b;
	int c;

	public ThreeElement(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public void accept(NumberVisitor visitor) {
		visitor.visit(this);
	}

}
