package test.com.tonyx.lab.liskov.exerc3;

import junit.framework.TestCase;
import com.tonyx.lab.liskov.exerc3.SquareI;
import com.tonyx.lab.liskov.exerc3.SquareImpl;
import com.tonyx.lab.liskov.exerc3.RectangleI;
import com.tonyx.lab.liskov.exerc3.RectangleImpl;

import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: Antonio Lucca aka tonyx
 * Date: 7-dic-2006
 * Time: 14.35.33
 * To change this template use File | Settings | File Templates.
 */
public class TestRectangleAndSquareWithImmutable extends TestCase {
       public void testEquals()
    {
        SquareI quadrato = new SquareImpl(1);
        SquareI quadrato2 = new SquareImpl(1);
        assertEquals(quadrato,quadrato2);
        assertEquals(quadrato2,quadrato);
    }

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
    }

    public void testEqualsRectangleAndQuad()
    {
        SquareI quadrato = new SquareImpl(1);
        RectangleI rettangolo = new RectangleImpl(1,1);
        assertEquals(rettangolo,quadrato);
    }

}
