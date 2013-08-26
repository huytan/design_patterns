package test.com.tonyx.lab.liskov.utils;

import com.tonyx.lab.liskov.utils.InstanceGenerator;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by IntelliJ IDEA.
 * User: Antonio Lucca aka tonyx
 * Date: 8-dic-2006
 * Time: 13.44.54
 * To change this template use File | Settings | File Templates.
 */
public class MethodAndParameterGen {
    Method method;
    InstanceGenerator[]  instanceGenerators;
    Object[] instantiatedParameters;
    public MethodAndParameterGen(Method method,InstanceGenerator[] instanceGenerators)
    {
        this.method=method;
        this.instanceGenerators=instanceGenerators;
    }
    public void activate(Object object) throws InvocationTargetException,IllegalAccessException {
        instantiateParameters();
        method.invoke(object,instantiatedParameters);
    }

    private void instantiateParameters()
    {
        instantiatedParameters = new Object[instanceGenerators.length];
        for (int i=0;i<instanceGenerators.length;i++)
        {
            instantiatedParameters[i]=instanceGenerators[i].getAnInstance();
        }
    }
}


