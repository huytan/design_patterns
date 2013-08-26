package test.com.tonyx.lab.liskov.exerc2;

import com.tonyx.lab.liskov.exerc2.SquareI;
import com.tonyx.lab.liskov.exerc2.SquareImpl;
import com.tonyx.lab.liskov.exerc2.RectangleI;
import com.tonyx.lab.liskov.exerc2.RectangleImpl;

import java.util.HashSet;

import junit.framework.TestCase;

/**
 * Created by IntelliJ IDEA.
 * User: Antonio Lucca aka tonyx
 * Date: 7-dic-2006
 * Time: 12.19.06
 * To change this template use File | Settings | File Templates.
 */
public class TestRectangleAndSquare extends TestCase {
        public void testEquals()
    {
        SquareI quadrato = new SquareImpl(1);
        SquareI quadrato2 = new SquareImpl(1);
        assertEquals(quadrato,quadrato2);
        assertEquals(quadrato2,quadrato);
    }

    // we "fixed" saing that Retangle and Square cannot be one subclass of the other
    // however we lost one thing: the possibility to compare a square and a rectangle
    // then the following tests about equality (and collection) of rectangle and square

    public void testCollection()
    {
        HashSet myHash = new HashSet();
        SquareI quadrato = new SquareImpl(1);
        RectangleI rettangolo = new RectangleImpl(1,1);

        myHash.add(quadrato);
        myHash.add(rettangolo);
        assertEquals(1,myHash.size());
    }



    public void testEqualsQuadAndRectangle()
    {
        SquareI quadrato = new SquareImpl(1);
        RectangleI rettangolo = new RectangleImpl(1,1);
        assertEquals(quadrato,rettangolo);
        assertEquals(rettangolo,quadrato);
    }
}
