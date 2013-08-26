package test.com.tonyx.lab.liskov.utils;

import junit.framework.TestCase;
import com.tonyx.lab.liskov.utils.InstanceGenerator;

/**
 * Created by IntelliJ IDEA.
 * User: Antonio Lucca aka tonyx
 * Date: 7-dic-2006
 * Time: 16.46.43
 * To change this template use File | Settings | File Templates.
 */
public class TestInstanceGenerator extends TestCase {
    InstanceGenerator instanceGeneratorPositiveDouble;
    InstanceGenerator instanceGeneratorPositiveDouble2;
    protected void setUp() throws Exception {
        instanceGeneratorPositiveDouble = new InstanceGenerator()
        {
            public Object getAnInstance()
            {
                return new Double(random.nextDouble());
            }
        };

        instanceGeneratorPositiveDouble2 = new InstanceGenerator()
        {
            public Object getAnInstance()
            {
                return new Double(random.nextDouble());
            }
        };
        super.setUp();    //To change body of overridden methods use File | Settings | File Templates.
    }


    public void testReproducibleRandom()
    {
        instanceGeneratorPositiveDouble.reproducibleRandomReset();
        instanceGeneratorPositiveDouble2.reproducibleRandomReset();
        Object instance1=instanceGeneratorPositiveDouble.getAnInstance();
        Object instance2=instanceGeneratorPositiveDouble2.getAnInstance();
        assertEquals(instance1,instance2);
    }

    public void testReproducibleRandomSameRandom()
    {
        instanceGeneratorPositiveDouble.reproducibleRandomReset();
        // instanceGeneratorPositiveDouble2.reproducibleRandomReset();
        Object instance1=instanceGeneratorPositiveDouble.getAnInstance();
        instanceGeneratorPositiveDouble.reproducibleRandomReset();
        Object instance2=instanceGeneratorPositiveDouble.getAnInstance();
        assertEquals(instance1,instance2);
    }

    public void testReproducibleRandomSameRandomAgain()
    {
        instanceGeneratorPositiveDouble.reproducibleRandomReset(4);
        // instanceGeneratorPositiveDouble2.reproducibleRandomReset();
        Object instance1=instanceGeneratorPositiveDouble.getAnInstance();
        instanceGeneratorPositiveDouble.reproducibleRandomReset(4);
        Object instance2=instanceGeneratorPositiveDouble.getAnInstance();
        assertEquals(instance1,instance2);
    }

    public void testReproducibleRandomSameRandomAgainX()
    {
        instanceGeneratorPositiveDouble.reproducibleRandomReset(4);
        // instanceGeneratorPositiveDouble2.reproducibleRandomReset();
        Object instance1=instanceGeneratorPositiveDouble.getAnInstance();
        instanceGeneratorPositiveDouble.reproducibleRandomReset(5);
        Object instance2=instanceGeneratorPositiveDouble.getAnInstance();
        assertNotSame(instance1,instance2);
    }




}
