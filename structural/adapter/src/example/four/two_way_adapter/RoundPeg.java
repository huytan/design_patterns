package example.four.two_way_adapter;

public class RoundPeg implements IRoundPeg {

	@Override
	public void insertIntoHole(String msg) {
		System.out.println("RoundPeg insertIntoHole(): " + msg);
	}
}
