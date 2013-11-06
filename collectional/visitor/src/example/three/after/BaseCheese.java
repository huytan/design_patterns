package example.three.after;

public class BaseCheese implements Cheese {

	@Override
	public void accept(Visitor v) throws Exception {
		v.visit(this);
	}

}
