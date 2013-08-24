package test.com.tonyx.lab.liskov.utils;

import junit.framework.TestCase;

import java.util.Random;
import java.lang.reflect.Method;

import com.tonyx.lab.liskov.utils.InstanceGenerator;
import test.com.tonyx.lab.liskov.utils.MethodAndParameterGen;

/**
 * Created by IntelliJ IDEA.
 * User: Antonio Lucca aka tonyx
 * Date: 8-dic-2006
 * Time: 13.26.39
 * To change this template use File | Settings | File Templates.
 */
public class TestMethodWithParameters extends TestCase {
    InstanceGenerator booleanTrue;
    InstanceGenerator booleanFalse;
    protected void setUp() throws Exception {

        booleanTrue = new InstanceGenerator()
        {
            Random random= new Random(System.currentTimeMillis());

            public Object getAnInstance() {
                return new Boolean(true);
            }
        };

        booleanFalse = new InstanceGenerator()
        {
            Random random= new Random(System.currentTimeMillis());

            public Object getAnInstance() {
                return new Boolean(false);
            }
        };


        super.setUp();    //To change body of overridden methods use File | Settings | File Templates.
    }

    public void testMethodAnsParameters() throws Exception
    {
        OnOff onOff = new OnOff();

        Method allMethods[] = OnOff.class.getMethods();
        for (int i=0;i<allMethods.length;i++){
            System.out.println(allMethods[i]);
        }

        Method setStateMethod = OnOff.class.getMethod("setState",new Class[]{boolean.class});
        MethodAndParameterGen methodAndParameterGenTrue = new MethodAndParameterGen(setStateMethod, new InstanceGenerator[]{booleanTrue});
        methodAndParameterGenTrue.activate(onOff);
        assertTrue(onOff.getState());

        MethodAndParameterGen methodAndParameterGenFalse = new MethodAndParameterGen(setStateMethod, new InstanceGenerator[] {booleanFalse});
        methodAndParameterGenFalse.activate(onOff);
        assertFalse(onOff.getState());
    }
}

