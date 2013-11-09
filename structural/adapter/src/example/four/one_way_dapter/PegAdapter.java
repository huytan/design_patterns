package example.four.one_way_dapter;

/**
 * The PegAdapter class. This is the Adapter class. It adapts a RoundPeg to a
 * SquarePeg. Its interface is that of a SquarePeg.
 */
public class PegAdapter extends SquarePeg {
	private RoundPeg roundPeg;

	public PegAdapter(RoundPeg peg) {
		this.roundPeg = peg;
	}

	public void insert(String str) {
		roundPeg.insertIntoHole(str);
	}
}
