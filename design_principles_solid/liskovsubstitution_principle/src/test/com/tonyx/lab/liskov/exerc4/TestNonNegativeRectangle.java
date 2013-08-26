package test.com.tonyx.lab.liskov.exerc4;

import junit.framework.TestCase;
import com.tonyx.lab.liskov.exerc4.RectangleImpl;
import com.tonyx.lab.liskov.exerc4.RectangleException;
import com.tonyx.lab.liskov.exerc4.RectangleWithNegatives;
import com.tonyx.lab.liskov.exerc4.RectangleI;

/**
 * Created by IntelliJ IDEA.
 * User: Antonio Lucca aka tonyx
 * Date: 12-dic-2006
 * Time: 0.11.03
 * To change this template use File | Settings | File Templates.
 */
public class TestNonNegativeRectangle extends TestCase {
    public void testNegativeRectangle()
    {
        RectangleImpl nonNegativeRectangle;
        try
        {
            nonNegativeRectangle = new RectangleImpl(-1.0,1.0);
            assertTrue(false);
        } catch (RectangleException e)
        {
        }
    }

    public void testNonNegativeRectangle()
    {
        RectangleImpl nonNegativeRectangle;
        try
        {
            nonNegativeRectangle = new RectangleImpl(1.0,1.0);
        } catch (RectangleException e)
        {
            assertTrue(false);
        }
    }

    public void testSubClassAllowingNegative()
    {
        RectangleWithNegatives rectangleWithNegatives;
        try {
            rectangleWithNegatives=new RectangleWithNegatives(-1.0,1.0);
        } catch (RectangleException e)
        {
            assertTrue(false);
        }
    }

    public void testSubClassAndClassEquality()
    {
        RectangleI rectangle=null,rectangleWithNegatives=null;

        try {
            rectangle = new RectangleImpl(1.0,1.0);
        } catch (RectangleException e)
        {
            assertTrue(false);
        }

        try {
            rectangleWithNegatives = new RectangleWithNegatives(1.0,1.0);
        } catch (RectangleException e)
        {
            assertTrue(false);
        }

        assertEquals(rectangle,rectangleWithNegatives);
        assertEquals(rectangleWithNegatives,rectangle);

    }
}
