package example.four.two_way_adapter;

public class SquarePeg implements ISquarePeg {

	@Override
	public void insert(String str) {
		System.out.println("SquarePeg insert(): " + str);
	}

}
