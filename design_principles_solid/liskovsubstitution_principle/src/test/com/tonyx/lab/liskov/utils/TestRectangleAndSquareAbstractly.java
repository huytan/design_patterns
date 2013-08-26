package test.com.tonyx.lab.liskov.utils;

import junit.framework.TestCase;
import com.tonyx.lab.liskov.utils.InstanceGenerator;
import com.tonyx.lab.liskov.utils.Utilities;
import com.tonyx.lab.liskov.exerc1.Square;
import com.tonyx.lab.liskov.exerc1.Rectangle;

import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 * User: Antonio Lucca aka tonyx
 * Date: 8-dic-2006
 * Time: 15.05.51
 * To change this template use File | Settings | File Templates.
 */
public class TestRectangleAndSquareAbstractly extends TestCase {
    InstanceGenerator instGenForRectanglePar;
    InstanceGenerator instGenForSquarePar;

    Method squareSetWidth;
    Method squareSetHeigth;

    Method rectangleSetWidth;
    Method rectangleSetHeigth;

    protected void setUp() throws Exception {
        instGenForRectanglePar = new InstanceGenerator()
        {
            public Object getAnInstance()
            {
               return new Double(random.nextDouble()*10.0);
            }
        };

        instGenForSquarePar = new InstanceGenerator()
        {
            public Object getAnInstance()
            {
                return new Double(random.nextDouble()*10.0);
            }
        };

        instGenForRectanglePar.reproducibleRandomReset();
        instGenForSquarePar.reproducibleRandomReset();

        squareSetWidth = Square.class.getMethod("setWidth",new Class[]{double.class});
        squareSetHeigth = Square.class.getMethod("setLength",new Class[]{double.class});

        rectangleSetWidth = Rectangle.class.getMethod("setWidth",new Class[]{double.class});
        rectangleSetHeigth = Rectangle.class.getMethod("setLength",new Class[]{double.class});

        super.setUp();    //To change body of overridden methods use File | Settings | File Templates.
    }

    public void testSquareAndRectange() throws Exception
    {
        Rectangle rectangle=new Rectangle();
        Square square=new Square();

        rectangle.setWidth(1.0);
        rectangle.setLength(1.0);
        square.setWidth(1.0);
        square.setLength(1.0);

        assertEquals(rectangle,square);

        MethodAndParameterGen rectangleSetWidthMethodParamGen= new MethodAndParameterGen(rectangleSetWidth,
                new InstanceGenerator[]{instGenForRectanglePar});
        MethodAndParameterGen rectangleSetHeigthMethodParamGen= new MethodAndParameterGen(rectangleSetHeigth,
                new InstanceGenerator[]{instGenForRectanglePar});

        MethodAndParameterGen squareSetWidthMethodParamGen= new MethodAndParameterGen(squareSetWidth,
                new InstanceGenerator[]{instGenForSquarePar});
        MethodAndParameterGen squareSetHeigthMethodParamGen= new MethodAndParameterGen(squareSetHeigth,
                new InstanceGenerator[]{instGenForSquarePar});

        rectangleSetWidthMethodParamGen.activate(rectangle);
        rectangleSetHeigthMethodParamGen.activate(rectangle);

        squareSetWidthMethodParamGen.activate(square);
        squareSetHeigthMethodParamGen.activate(square);

        assertEquals(rectangle,square);
    }



    public void testRectangleSquareWithUtils() throws Exception
    {
        instGenForSquarePar.reproducibleRandomReset(0);
        Object[] squareAndRectangle = Utilities.activateMethods(Square.class,new String[] {"setWidth","setLength"},
                new Class[][] {{double.class},{double.class}},new Class[] {},
                new InstanceGenerator[][]{{instGenForRectanglePar},{instGenForRectanglePar}},
                new InstanceGenerator[]{},0,5);

        assertEquals(squareAndRectangle[0],squareAndRectangle[1]);
    }

}
