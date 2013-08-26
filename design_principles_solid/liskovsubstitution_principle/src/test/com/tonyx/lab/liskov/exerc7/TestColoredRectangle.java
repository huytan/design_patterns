package test.com.tonyx.lab.liskov.exerc7;

import junit.framework.TestCase;
import com.tonyx.lab.liskov.exerc7.*;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by IntelliJ IDEA.
 * User: Antonio Lucca aka tonyx
 * Date: Feb 20, 2007
 * Time: 2:22:11 PM
 */
public class TestColoredRectangle extends TestCase {

    static RectangleI coloredBlack;
    static RectangleI coloredWhite;
    static RectangleI uncoloredRectangle;
    static RectangleI plainRectangle;
    static RectangleI coloredPositiveTridimentionalRectangleDefault;
    static RectangleI coloredPositiveTridimentionalRectangleNoDefault;

    protected void setUp() throws Exception {
        coloredWhite = new ColoredPositiveRectangle(1.1,1.1,ColoredPositiveRectangle.BIANCO);
        coloredBlack = new ColoredPositiveRectangle(1.1,1.1,ColoredPositiveRectangle.NERO);
        uncoloredRectangle = new RectangleWithNegatives(1.1,1.1);
        plainRectangle = new RectangleImpl(1.1,1.1);

        coloredPositiveTridimentionalRectangleDefault = new ColoredPositiveTridimensionalRectangle(1.1,1.1);
        coloredPositiveTridimentionalRectangleNoDefault = new ColoredPositiveTridimensionalRectangle(1.1,1.1,1.1,ColoredPositiveRectangle.NERO);

        super.setUp();
    }


    public static void testEqualsSubAndSuper() throws Exception
    {
        ColoredPositiveRectangle coloredPositiveRectangle= new ColoredPositiveRectangle(1.1,1.1,ColoredPositiveRectangle.BIANCO);
        RectangleImpl rectangleImpl = new RectangleImpl(1.1,1.1);
        assertEquals(coloredPositiveRectangle,rectangleImpl);
    }

    public static void testVeryDiffereentSubAndSuper() throws Exception
    {
        ColoredPositiveRectangle coloredPositiveRectangle= new ColoredPositiveRectangle(1.5,2.0,ColoredPositiveRectangle.BIANCO);
        RectangleImpl rectangleImpl = new RectangleImpl(1.1,1.1);
        assertFalse (coloredPositiveRectangle.equals(rectangleImpl));
    }

    public static void testEqualsSubAndSuperNodefaultColor() throws Exception
    {
        ColoredPositiveRectangle coloredPositiveRectangle= new ColoredPositiveRectangle(1.1,1.1,ColoredPositiveRectangle.GIALLO);
        RectangleImpl rectangleImpl = new RectangleImpl(1.1,1.1);
        assertFalse(coloredPositiveRectangle.equals(rectangleImpl));
    }


    public static void testSuperAndSubNotPositive() throws Exception
    {
        ColoredPositiveRectangle coloredPositiveRectangle= new ColoredPositiveRectangle(1.1,1.1,ColoredPositiveRectangle.GIALLO);
        RectangleImpl rectangleImpl = new RectangleImpl(1.1,1.1);
        assertFalse(coloredPositiveRectangle.equals(rectangleImpl));
        // they are not the same
    }

    public static void testSuperAndSubNotPositiveReverse() throws Exception
    {
        ColoredPositiveRectangle coloredPositiveRectangle= new ColoredPositiveRectangle(1.1,1.1,ColoredPositiveRectangle.GIALLO);
        RectangleImpl rectangleImpl = new RectangleImpl(1.1,1.1);
        assertFalse(rectangleImpl.equals(coloredPositiveRectangle));
        // and the opposite is true as well. In exerc5 this was an issue
    }



    public static void testNotEqualsSubAndSuper() throws Exception
    {
        ColoredPositiveRectangle coloredPositiveRectangle= new ColoredPositiveRectangle(1.1,1.1,ColoredPositiveRectangle.GIALLO);
        RectangleImpl rectangleImpl = new RectangleImpl(1.1,1.1);
        assertFalse(coloredPositiveRectangle.equals(rectangleImpl));
    }

    public static void testAgainEqualsSubAndSuper() throws Exception
    {
        ColoredPositiveRectangle coloredPositiveRectangle= new ColoredPositiveRectangle(1.1,1.1,ColoredPositiveRectangle.BIANCO);
        RectangleImpl rectangleImpl = new RectangleImpl(1.1,1.1);
        assertEquals(coloredPositiveRectangle,rectangleImpl);
    }

    public static void testAgainEqualsSubAndSuperReverse() throws Exception
    {
        ColoredPositiveRectangle coloredPositiveRectangle= new ColoredPositiveRectangle(1.1,1.1,ColoredPositiveRectangle.BIANCO);
        RectangleImpl rectangleImpl = new RectangleImpl(1.1,1.1);
        assertEquals(rectangleImpl, coloredPositiveRectangle);
    }


    public static void testColoredWhite() throws Exception
       {
           ColoredPositiveRectangle coloredPositiveRectangleWhite= new ColoredPositiveRectangle(1.1,1.1,ColoredPositiveRectangle.BIANCO);
           ColoredPositiveRectangle coloredPositiveRectangle= new ColoredPositiveRectangle(1.1,1.1);
           assertEquals(coloredPositiveRectangle,coloredPositiveRectangleWhite);

       }

       public static void testColoredWhiteRev() throws Exception
       {
           ColoredPositiveRectangle coloredPositiveRectangleWhite= new ColoredPositiveRectangle(1.1,1.1,ColoredPositiveRectangle.BIANCO);
           ColoredPositiveRectangle coloredPositiveRectangle= new ColoredPositiveRectangle(1.1,1.1);
           assertEquals(coloredPositiveRectangleWhite, coloredPositiveRectangle);
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

    public static void testCollection4() throws Exception
    {
        ColoredPositiveRectangle coloredPositiveRectangle= new ColoredPositiveRectangle(1.1,1.1,ColoredPositiveRectangle.GIALLO);
        ColoredPositiveRectangle coloredPositiveRectangle2= new ColoredPositiveRectangle(1.1,1.1,ColoredPositiveRectangle.BIANCO);
        RectangleImpl rectangleImpl = new RectangleImpl(1.1,1.1);
        HashSet myHashSet  = new HashSet();
        myHashSet.add(rectangleImpl);
        myHashSet.add(coloredPositiveRectangle);
        myHashSet.add(coloredPositiveRectangle2);
        assertEquals(2,myHashSet.size());

        assertTrue(myHashSet.contains(coloredPositiveRectangle));
        assertTrue(myHashSet.contains(coloredPositiveRectangle2));
        assertTrue(myHashSet.contains(rectangleImpl));
        assertEquals(coloredPositiveRectangle2,rectangleImpl);
    }

    public static void testCollection5() throws Exception
    {
        ColoredPositiveRectangle coloredPositiveRectangle= new ColoredPositiveRectangle(1.1,1.1,ColoredPositiveRectangle.GIALLO);
        ColoredPositiveRectangle coloredPositiveRectangle2= new ColoredPositiveRectangle(1.1,1.1,ColoredPositiveRectangle.BIANCO);
        RectangleImpl rectangleImpl = new RectangleImpl(1.1,1.1);
        HashSet myHashSet  = new HashSet();
        myHashSet.add(rectangleImpl);
        myHashSet.add(coloredPositiveRectangle);
        myHashSet.add(coloredPositiveRectangle2);
        assertEquals(2,myHashSet.size());

        Iterator iter = myHashSet.iterator();
        RectangleI first = (RectangleI)iter.next();
        RectangleI second = (RectangleI)iter.next();
        assertFalse(first.equals(second));
    }

    public static void testTransitivityOfUnequalsObjects()  throws Exception
    {
        RectangleI coloredBlack = new ColoredPositiveRectangle(1.1,1.1,ColoredPositiveRectangle.NERO);
        RectangleI uncoloredRectangle = new RectangleWithNegatives(1.1,1.1);
        RectangleI plainRectangle = new RectangleImpl(1.1,1.1);
        assertFalse(coloredBlack.equals(uncoloredRectangle));
    }


    public static void testTransitivityOfUnequalsObjects2()  throws Exception
    {
        //static RectangleI coloredBlack;
        //static RectangleI uncoloredRectangle;
        //static RectangleI plainRectangle;

        //static RectangleI coloredWhite;
        assertFalse(coloredBlack.equals(uncoloredRectangle));
    }

    public static void testTransitivityOfUnequalsObjects3()  throws Exception
    {
        assertFalse(coloredBlack.equals(plainRectangle));
    }

    public static void testTransitivityOfUnequalsObjects4()  throws Exception
    {
        assertEquals(uncoloredRectangle,plainRectangle);
    }



    public static void testTransitivityOfUnequalsObjects22()  throws Exception
    {
        //static RectangleI coloredBlack;
        //static RectangleI uncoloredRectangle;
        //static RectangleI plainRectangle;

        //static RectangleI coloredWhite;
        assertFalse(uncoloredRectangle.equals(coloredBlack));
    }

    public static void testTransitivityOfUnequalsObjects32()  throws Exception
    {
        assertFalse(plainRectangle.equals(coloredBlack));
    }

    public static void testTransitivityOfUnequalsObjects42()  throws Exception
    {
        assertTrue(plainRectangle.equals(uncoloredRectangle));
    }


   public static void testTransitivityOfequalsObjects2()  throws Exception
      {
          //static RectangleI coloredBlack;
          //static RectangleI uncoloredRectangle;
          //static RectangleI plainRectangle;

          //static RectangleI coloredWhite;
          assertFalse(coloredBlack.equals(uncoloredRectangle));
      }

      public static void testTransitivityOfequalsObjects3()  throws Exception
      {
          assertFalse(coloredBlack.equals(plainRectangle));
      }

      public static void testTransitivityOfequalsObjects4()  throws Exception
      {
          assertTrue(uncoloredRectangle.equals(plainRectangle));
      }




      public static void testTransitivityOfequalsObjects22()  throws Exception
      {
          //static RectangleI coloredBlack;
          //static RectangleI uncoloredRectangle;
          //static RectangleI plainRectangle;

          //static RectangleI coloredWhite;
          assertEquals(uncoloredRectangle,coloredWhite);
      }

      public static void testTransitivityOfequalsObjects32()  throws Exception
      {
          assertEquals(plainRectangle,coloredWhite);
      }

      public static void testTransitivityOfequalsObjects42()  throws Exception
      {
          assertEquals(plainRectangle,uncoloredRectangle);
      }



      // now testing class with sub-subclass

      public void testClassWithSubSubSimmetryForward() throws Exception
      {
       //   coloredPositiveTridimentionalRectangleDefault = new ColoredPositiveTridimensionalRectangle(1.1,1.1);
        //     coloredPositiveTridimentionalRectangleNoDefault = new ColoredPositiveTridimensionalRectangle(1.1,1.1,1.1,ColoredPositiveRectangle.NERO);
         assertEquals(plainRectangle,coloredPositiveTridimentionalRectangleDefault);
      }

    public void testClassWithSubSubSimmetryBackward() throws Exception
    {
        //   coloredPositiveTridimentionalRectangleDefault = new ColoredPositiveTridimensionalRectangle(1.1,1.1);
        //     coloredPositiveTridimentionalRectangleNoDefault = new ColoredPositiveTridimensionalRectangle(1.1,1.1,1.1,ColoredPositiveRectangle.NERO);
        assertEquals(coloredPositiveTridimentionalRectangleDefault,plainRectangle);
    }


     public void testSubWithSubSubSimmetryForward() throws Exception
      {
       //   coloredPositiveTridimentionalRectangleDefault = new ColoredPositiveTridimensionalRectangle(1.1,1.1);
        //     coloredPositiveTridimentionalRectangleNoDefault = new ColoredPositiveTridimensionalRectangle(1.1,1.1,1.1,ColoredPositiveRectangle.NERO);
         assertEquals(coloredPositiveTridimentionalRectangleDefault,coloredWhite);
      }

    public void testSubWithWubWubSimmetryBackward() throws Exception
    {
        //   coloredPositiveTridimentionalRectangleDefault = new ColoredPositiveTridimensionalRectangle(1.1,1.1);
        //     coloredPositiveTridimentionalRectangleNoDefault = new ColoredPositiveTridimensionalRectangle(1.1,1.1,1.1,ColoredPositiveRectangle.NERO);
        assertEquals(coloredWhite,coloredPositiveTridimentionalRectangleDefault);
    }


    public void testSubUncoloredWithSubSubSimmetryForward() throws Exception
    {
        //   coloredPositiveTridimentionalRectangleDefault = new ColoredPositiveTridimensionalRectangle(1.1,1.1);
        //     coloredPositiveTridimentionalRectangleNoDefault = new ColoredPositiveTridimensionalRectangle(1.1,1.1,1.1,ColoredPositiveRectangle.NERO);
        assertEquals(coloredPositiveTridimentionalRectangleDefault,uncoloredRectangle);
    }

    public void testSubUncoloredWithWubWubSimmetryBackward() throws Exception
    {
        //   coloredPositiveTridimentionalRectangleDefault = new ColoredPositiveTridimensionalRectangle(1.1,1.1);
        //     coloredPositiveTridimentionalRectangleNoDefault = new ColoredPositiveTridimensionalRectangle(1.1,1.1,1.1,ColoredPositiveRectangle.NERO);
        assertEquals(uncoloredRectangle,coloredPositiveTridimentionalRectangleDefault);
    }



   // now test for different


    public void testNotSameClassWithSubSubForward() throws Exception
    {
        assertFalse(plainRectangle.equals(coloredPositiveTridimentionalRectangleNoDefault));
    }

    public void testNotSameClassWithSubSubBackward() throws Exception
    {
        assertFalse(coloredPositiveTridimentionalRectangleNoDefault.equals(plainRectangle));
    }

//
    public void testNotSameSubWithSubSubForward() throws Exception
    {
        assertFalse(coloredWhite.equals(coloredPositiveTridimentionalRectangleNoDefault));
    }

    public void testNotSameSubWithSubSubBackward() throws Exception
    {
        assertFalse(coloredPositiveTridimentionalRectangleNoDefault.equals(coloredWhite));
    }


    public void testNotSameNotDefaultSubWithSubSubForward() throws Exception
    {
        assertFalse(coloredBlack.equals(coloredPositiveTridimentionalRectangleNoDefault));
    }

    public void testNotSameNotDefaultSubWithSubSubBackward() throws Exception
    {
        assertFalse(coloredPositiveTridimentionalRectangleNoDefault.equals(coloredBlack));
    }


}
