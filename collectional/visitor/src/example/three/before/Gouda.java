package example.three.before;

public class Gouda implements Cheese {
	String goudaName() {
		return "This is Gouda";
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}

}
