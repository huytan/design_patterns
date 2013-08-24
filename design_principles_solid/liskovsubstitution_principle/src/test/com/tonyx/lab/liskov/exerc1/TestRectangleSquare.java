package test.com.tonyx.lab.liskov.exerc1;

import junit.framework.TestCase;
import com.tonyx.lab.liskov.exerc1.Rectangle;
import com.tonyx.lab.liskov.exerc1.Square;

/**
 * Created by IntelliJ IDEA.
 * User: Antonio Lucca aka tonyx
 * Date: 6-dic-2006
 * Time: 22.04.31
 * To change this template use File | Settings | File Templates.
 */
public class TestRectangleSquare extends TestCase {

    /**
     * a test for the rectangle
     */
    public void testRectangle()
    {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(1);
        rectangle.setWidth(2);
        assertTrue(rectangle.getWidth()==2.0);
        assertTrue(rectangle.getLength()==1.0);
    }

    // we want that any subclasse behave in the same way, than the same test
    // should pass when we substitute rectangle with square

    /**
     * the same test for the square, it fails thus
     * the lsp is violated
     */
    public void testSquare()
    {
        Square square = new Square();
        square.setLength(1);
        square.setWidth(2);
        assertTrue(square.getWidth()==2.0);
        assertTrue(square.getLength()==1.0);
    }
    // but this test does not pass.


    /**
     * however, both are "equals"
     */
    public void testRectangleEqualsSquare()
    {
        Rectangle square = new Square();
        square.setLength(1);

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(1);
        rectangle.setWidth(1);

        assertEquals(rectangle,square);
    }
    // however rectangle and square are comparable, and if they are the same, the equality fits
    // this is an argument that supports the use of instanceof, where if you use getClass it does
    // not works, unless you check for multiple types (rtti.. witch implies in this case violation
    // of open closed principle

}
