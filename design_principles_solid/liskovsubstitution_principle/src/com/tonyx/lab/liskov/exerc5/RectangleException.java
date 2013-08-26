package com.tonyx.lab.liskov.exerc5;

/**
 * Created by IntelliJ IDEA.
 * User: Antonio Lucca aka tonyx
 * Date: 11-dic-2006
 * Time: 23.38.42
 * To change this template use File | Settings | File Templates.
 */
public class RectangleException extends Exception{


    public RectangleException() {
        super();    //To change body of overridden methods use File | Settings | File Templates.
    }

    public RectangleException(String message) {
        super(message);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public RectangleException(Throwable cause) {
        super(cause);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public RectangleException(String message, Throwable cause) {
        super(message, cause);    //To change body of overridden methods use File | Settings | File Templates.
    }
}
