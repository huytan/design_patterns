package com.tonyx.lab.liskov.exerc7;


/**
 * Created by IntelliJ IDEA.
 * User: Antonio Lucca aka tonyx
 * Date: 11-dic-2006
 * Time: 23.58.19
 * To change this template use File | Settings | File Templates.
 */
public class RectangleWithNegatives extends RectangleImpl {
    public RectangleWithNegatives(double heigth, double length) throws RectangleException {
        setHeigth(heigth);
        setLength(length);
    }

    public void setHeigth(double heigth) throws RectangleException {
        this.heigth=heigth;
    }

    public void setLength(double length) throws RectangleException {
        this.length=length;
    }
}
