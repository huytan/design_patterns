package test.com.tonyx.lab.liskov.exerc5;

import junit.framework.TestCase;
import com.tonyx.lab.liskov.exerc5.ColoredPositiveRectangle;
import com.tonyx.lab.liskov.exerc5.RectangleImpl;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by IntelliJ IDEA.
 * User: Antonio Lucca aka tonyx
 * Date: Jan 4, 2007
 * Time: 4:38:27 PM
 */
public class TestColoredRectangle extends TestCase {
    public static void testEqualsSubAndSuper() throws Exception
    {
        ColoredPositiveRectangle coloredPositiveRectangle= new ColoredPositiveRectangle(1.1,1.1);
        RectangleImpl rectangleImpl = new RectangleImpl(1.1,1.1);
        assertEquals(coloredPositiveRectangle,rectangleImpl);
    }

    public static void testEqualsSubAndSuperNodefaultColor() throws Exception
    {
        ColoredPositiveRectangle coloredPositiveRectangle= new ColoredPositiveRectangle(1.1,1.1,ColoredPositiveRectangle.GIALLO);
        RectangleImpl rectangleImpl = new RectangleImpl(1.1,1.1);
        assertEquals(coloredPositiveRectangle,rectangleImpl);
        // this is claimed to be true for simmetry of equal but fails
    }

    public static void testEqualsSubAndSuperNodefaultColorReverse() throws Exception
    {
        ColoredPositiveRectangle coloredPositiveRectangle= new ColoredPositiveRectangle(1.1,1.1,ColoredPositiveRectangle.GIALLO);
        RectangleImpl rectangleImpl = new RectangleImpl(1.1,1.1);
        assertEquals(rectangleImpl,coloredPositiveRectangle);
        // this is true, and is the opposite of the previous test. Actually the test passes, but we lost simmetry of equals
        // because the previus test fails.
    }

    public static void testNotEqualsSubAndSuper() throws Exception
    {
        ColoredPositiveRectangle coloredPositiveRectangle= new ColoredPositiveRectangle(1.1,1.1,ColoredPositiveRectangle.GIALLO);
        RectangleImpl rectangleImpl = new RectangleImpl(1.1,1.1);
        //assertNotSame(coloredPositiveRectangle,rectangleImpl);
        assertFalse(coloredPositiveRectangle.equals(rectangleImpl));
    }

    public static void testAgainEqualsSubAndSuper() throws Exception
    {
        ColoredPositiveRectangle coloredPositiveRectangle= new ColoredPositiveRectangle(1.1,1.1,ColoredPositiveRectangle.BIANCO);
        RectangleImpl rectangleImpl = new RectangleImpl(1.1,1.1);
        //assertNotSame(coloredPositiveRectangle,rectangleImpl);
        assertTrue(coloredPositiveRectangle.equals(rectangleImpl));
    }

    public static void testSubsEquals() throws Exception
    {
        ColoredPositiveRectangle coloredPositiveRectangle= new ColoredPositiveRectangle(1.1,1.1,ColoredPositiveRectangle.GIALLO);
        ColoredPositiveRectangle coloredPositiveRectangle2= new ColoredPositiveRectangle(1.1,1.1,ColoredPositiveRectangle.GIALLO);

        assertEquals(coloredPositiveRectangle,coloredPositiveRectangle2);
    }

    public static void testCollection1() throws Exception
    {
        ColoredPositiveRectangle coloredPositiveRectangle= new ColoredPositiveRectangle(1.1,1.1,ColoredPositiveRectangle.BIANCO);
        RectangleImpl rectangleImpl = new RectangleImpl(1.1,1.1);
        HashSet myHashSet  = new HashSet();
        myHashSet.add(coloredPositiveRectangle);
        myHashSet.add(rectangleImpl);
        assertEquals(1,myHashSet.size());
    }

    public static void testCollection2() throws Exception
    {
        ColoredPositiveRectangle coloredPositiveRectangle= new ColoredPositiveRectangle(1.1,1.1,ColoredPositiveRectangle.BIANCO);
        RectangleImpl rectangleImpl = new RectangleImpl(1.1,1.1);
        HashSet myHashSet  = new HashSet();
        myHashSet.add(coloredPositiveRectangle);
        myHashSet.add(rectangleImpl);
        assertEquals(1,myHashSet.size());
        Iterator myIterator = myHashSet.iterator();
        Object element = myIterator.next();
        assertTrue(element.getClass().equals(ColoredPositiveRectangle.class));
    }

    public static void testCollection3() throws Exception
    {
        ColoredPositiveRectangle coloredPositiveRectangle= new ColoredPositiveRectangle(1.1,1.1,ColoredPositiveRectangle.BIANCO);
        RectangleImpl rectangleImpl = new RectangleImpl(1.1,1.1);
        HashSet myHashSet  = new HashSet();
        myHashSet.add(rectangleImpl);
        myHashSet.add(coloredPositiveRectangle);
        assertEquals(1,myHashSet.size());
        Iterator myIterator = myHashSet.iterator();
        Object element = myIterator.next();
        assertTrue(element.getClass().equals(RectangleImpl.class));
    }
}
