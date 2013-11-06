package example.three.before;

public class Brie implements Cheese {
	String brieName() {
		return "This is Brie";
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}

}
