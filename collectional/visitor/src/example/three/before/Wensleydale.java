package example.three.before;

public class Wensleydale implements Cheese {
	String wensleydaleName() {
		return "This is wensleydale";
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}
