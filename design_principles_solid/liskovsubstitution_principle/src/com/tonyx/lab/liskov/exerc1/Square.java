package com.tonyx.lab.liskov.exerc1;

/**
 * Created by IntelliJ IDEA.
 * User: Antonio Lucca aka tonyx
 * Date: 6-dic-2006
 * Time: 22.00.09
 * To change this template use File | Settings | File Templates.
 */
public class Square extends Rectangle {
    public void setWidth(double width) {
        super.setWidth(width);    //To change body of overridden methods use File | Settings | File Templates.
        super.setLength(width);
    }

    public void setLength(double length) {
        super.setLength(length);    //To change body of overridden methods use File | Settings | File Templates.
        super.setWidth(length);
    }
}
