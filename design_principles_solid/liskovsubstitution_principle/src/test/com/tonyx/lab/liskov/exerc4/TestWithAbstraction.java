package test.com.tonyx.lab.liskov.exerc4;

import junit.framework.TestCase;
import com.tonyx.lab.liskov.utils.InstanceGenerator;
import com.tonyx.lab.liskov.utils.Utilities;
import com.tonyx.lab.liskov.exerc4.RectangleWithNegatives;
import com.tonyx.lab.liskov.exerc4.RectangleImpl;
import com.tonyx.lab.liskov.exerc4.RectangleException;

/**
 * Created by IntelliJ IDEA.
 * User: Antonio Lucca aka tonyx
 * Date: 12-dic-2006
 * Time: 0.21.59
 * To change this template use File | Settings | File Templates.
 */
public class TestWithAbstraction extends TestCase {
    InstanceGenerator instGenForRectanglePar;

    protected void setUp() throws Exception {
        instGenForRectanglePar = new InstanceGenerator() {
            public Object getAnInstance() {
                return new Double(random.nextDouble() * 10.0);
            }
        };

        instGenForRectanglePar.reproducibleRandomReset();
        super.setUp();    //To change body of overridden methods use File | Settings | File Templates.
    }

    public void testRectangleSquareWithUtils() throws Exception
    {
        // test the validity of the instancegenerator as parameter for the methods and instances of
        // the superclass
        RectangleImpl rectangleNoNegatives;
        for (int i=0;i<100;i++)
        {
            try {
                rectangleNoNegatives = new RectangleImpl(((Double)(instGenForRectanglePar.getAnInstance())).doubleValue(),((Double)(instGenForRectanglePar.getAnInstance())).doubleValue());
            }
            catch (RectangleException e)
            {
                assertTrue(false);
            }

        }

        // this messy call activate the same sequence of method with same parameters, on class and superclass
        Object[] rectangleAndNegativeRectangle = Utilities.activateMethods(RectangleWithNegatives.class,new String[] {"setHeigth","setLength"},
                new Class[][] {{double.class},{double.class}},new Class[] {double.class,double.class},
                new InstanceGenerator[][]{{instGenForRectanglePar},{instGenForRectanglePar}},
                new InstanceGenerator[]{instGenForRectanglePar,instGenForRectanglePar},0,5);

        assertEquals(rectangleAndNegativeRectangle[0],rectangleAndNegativeRectangle[1]);
        // that are returned in an array and we can check if the state is same for the former and the latter
    }
}
