package com.tonyx.lab.liskov.exerc6;

/**
 * Created by IntelliJ IDEA.
 * User: Antonio Lucca aka tonyx
 * Date: Jan 5, 2007
 * Time: 12:00:13 PM
 */
public class Utils {
    public static boolean isHerarchicallySubClass(Class first, Class second)
    {
        Class iter = first;
        while (!iter.equals(Object.class))
        {
            iter=iter.getSuperclass();
            if (iter.equals(second))
                return true;
        }
        return false;
    }
}
