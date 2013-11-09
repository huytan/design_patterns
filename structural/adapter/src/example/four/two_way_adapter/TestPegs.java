package example.four.two_way_adapter;

public class TestPegs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create some pegs.
		RoundPeg roundPeg = new RoundPeg();
		SquarePeg squarePeg = new SquarePeg();

		// Do an insert using the square peg.
		squarePeg.insert("Inserting square peg...");
		// Create a two-way adapter and do an insert with it.
		ISquarePeg roundToSquare = new PegAdapter(roundPeg);
		roundToSquare.insert("Inserting round peg...");

		// Do an insert using the round peg.
		roundPeg.insertIntoHole("Inserting round peg...");
		// Create a two-way adapter and do an insert with it.
		IRoundPeg squareToRound = new PegAdapter(squarePeg);
		squareToRound.insertIntoHole("Inserting square peg...");

	}

}
