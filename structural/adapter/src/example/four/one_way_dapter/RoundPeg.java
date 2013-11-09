package example.four.one_way_dapter;

/**
 * The RoundPeg class. This is the Adaptee class.
 */
public class RoundPeg {
	public void insertIntoHole(String msg) {
		System.out.println("RoundPeg insertIntoHole(): " + msg);
	}
}
/*
 * If a client only understands the SquarePeg interface for inserting
	pegs using the insert() method, how can it insert round pegs?  A
	peg adapter!
 * 
 * */
