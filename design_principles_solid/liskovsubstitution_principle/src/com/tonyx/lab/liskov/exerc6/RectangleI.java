package com.tonyx.lab.liskov.exerc6;


/**
 * Created by IntelliJ IDEA.
 * User: Antonio Lucca aka tonyx
 * Date: 11-dic-2006
 * Time: 23.37.01
 * To change this template use File | Settings | File Templates.
 */
public interface RectangleI {
    public void setHeigth(double heigth) throws RectangleException;
    public void setLength(double length) throws RectangleException;
    public double getHeigth();
    public double getLength();
}
