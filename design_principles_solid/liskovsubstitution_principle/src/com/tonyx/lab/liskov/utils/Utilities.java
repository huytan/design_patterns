package com.tonyx.lab.liskov.utils;

import test.com.tonyx.lab.liskov.utils.MethodAndParameterGen;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


/**
 * Created by IntelliJ IDEA.
 * User: Antonio Lucca aka tonyx
 * Date: 11-dic-2006
 * Time: 21.53.45
 * To change this template use File | Settings | File Templates.
 */
public class Utilities {
    /**
     * @param subClass the class that is actually a subclass under test, to be instantiated and applied methods
     * @param methodsNames the names of the methods that are to be executed on the class
     * @param parameterClasses the double array of parameters type of each method (even primiteves)
     * @param constructorPars the array of types for the constructor
     * @param instGensForMethods double array of instance generator for the parameters of the methods
     * @param instanceGeneratorForConstructor  array of instance generator for the constructor
     * @param seed the seed that will be used to initialize any instance generator
     * @param iterations the number of times that the methods will be activated
     * @return two objects representing the class and the superclass instances after initialization and methods execution
     * @throws Exception
     */
    public static Object[] activateMethods(Class subClass, String[] methodsNames,Class[][] parameterClasses,Class[] constructorPars,
                                           InstanceGenerator[][] instGensForMethods,InstanceGenerator[] instanceGeneratorForConstructor,int seed,int iterations) throws Exception
    {
        Constructor constructor;
        Object subClassObject;
        Object classObject;
        Class superClass = subClass.getSuperclass();
        MethodAndParameterGen[] methodAndPars = new MethodAndParameterGen[methodsNames.length];

        for (int i=0;i<instanceGeneratorForConstructor.length;i++) {
            instanceGeneratorForConstructor[i].reproducibleRandomReset(seed);
        }

        for (int i=0;i<instGensForMethods.length;i++) {
            for (int j=0;j<instGensForMethods[i].length;j++)
            {
                instGensForMethods[i][j].reproducibleRandomReset(seed);
            }
        }


        if (constructorPars.length!=0) {
            constructor = superClass.getConstructor(constructorPars);
            Object[] parametersForConstructor = new Object[instanceGeneratorForConstructor.length];
            for (int i =0;i<instanceGeneratorForConstructor.length;i++)
            {
                parametersForConstructor[i]=instanceGeneratorForConstructor[i].getAnInstance();
            }
            classObject = constructor.newInstance(parametersForConstructor);
        } else {
            classObject = superClass.newInstance();
        }

        for (int j=0;j<iterations;j++) {
            for (int i = 0; i < methodAndPars.length; i++) {
                Method amethod = superClass.getMethod(methodsNames[i], parameterClasses[i]);
                methodAndPars[i] = new MethodAndParameterGen(amethod, instGensForMethods[i]);
                methodAndPars[i].activate(classObject);
            }
        }




// initialize the instance generators for constructor and methods with the proper seed
        for (int i=0;i<instanceGeneratorForConstructor.length;i++) {
            instanceGeneratorForConstructor[i].reproducibleRandomReset(seed);
        }

        for (int i=0;i<instGensForMethods.length;i++) {
            for (int j=0;j<instGensForMethods[i].length;j++)
            {
                instGensForMethods[i][j].reproducibleRandomReset(seed);
            }
        }


        // now execute the block on the class
        // reset again the instance generator pairs

        // instantiate an object of the class

        if (constructorPars.length!=0) {
            constructor = subClass.getConstructor(constructorPars);
            Object[] parametersForConstructor = new Object[instanceGeneratorForConstructor.length];
            for (int i =0;i<instanceGeneratorForConstructor.length;i++)
            {
                parametersForConstructor[i]=instanceGeneratorForConstructor[i].getAnInstance();
            }
            subClassObject = constructor.newInstance(parametersForConstructor);
        } else {
            subClassObject = subClass.newInstance();
        }

        // now we should have the object instantiated
        // then execute methods for iter numeber of times

        for (int j = 0; j < iterations; j++) {
            for (int i = 0; i < methodAndPars.length; i++) {
                Method amethod = subClass.getMethod(methodsNames[i], parameterClasses[i]);
                methodAndPars[i] = new MethodAndParameterGen(amethod, instGensForMethods[i]);
                methodAndPars[i].activate(subClassObject);
            }
        }

        // now execute the block on the superclass
        // reset again the instance generator pairs

        return new Object[] {subClassObject,classObject};
    }


    /*

    public static boolean equivalents(Object first, Object second)
    {
        HashSet viewers = new HashSet();
        Method[] methods = first.getClass().getMethods();
        for (int i=0;i<methods.length;i++)
        {
            Annotation[] annotations =   methods[i].getAnnotations();

            for (int j=0;j<annotations.length;j++)
            {
                if (annotations[j].annotationType().equals(Viewer.class))
                {
                    viewers.add(methods[i]);
                }
            }

        }
        Iterator iterator = viewers.iterator();
        boolean result = true;
        while (iterator.hasNext()) {
            Method myMethod = (Method) iterator.next();
            Type retType = myMethod.getReturnType();

            if (isPrimitive(retType)) {
                try {
                    if (!(myMethod.invoke(first, new Object[]{}) == myMethod.invoke(second, new Object[]{}))) {
                        result = false;
                    }
                } catch (InvocationTargetException e) {
                    System.out.println(e);
                    // throw new Exception(e);
                }
                catch (IllegalAccessException e) {
                    System.out.println(e);
                    // throw new Exception(e);
                }


            } else
            {
                try {
                    if (!(myMethod.invoke(first, new Object[]{}).equals(myMethod.invoke(second, new Object[]{})))) {
                        result = false;
                    }
                } catch (InvocationTargetException e) {
                    System.out.println(e);
                    // throw new Exception(e);
                }
                catch (IllegalAccessException e) {
                    System.out.println(e);
                    // throw new Exception(e);
                }

            }

        }
        return result;
    }


    public static boolean isPrimitive(Type type)
    {
        if (type.equals(Integer.TYPE))
            return true;

        if (type.equals(Byte.TYPE))
            return true;

        if (type.equals(Short.TYPE))
            return true;

        if (type.equals(Character.TYPE))
            return true;

        if (type.equals(Long.TYPE))
            return true;

        if (type.equals(Float.TYPE))
            return true;

        if (type.equals(Double.TYPE))
            return true;

        if (type.equals(Boolean.TYPE))
            return true;

        return false;
    }
    */
}

