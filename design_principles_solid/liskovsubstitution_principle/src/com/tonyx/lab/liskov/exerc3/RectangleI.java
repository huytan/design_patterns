package com.tonyx.lab.liskov.exerc3;

/**
 * Created by IntelliJ IDEA.
 * User: Antonio Lucca aka tonyx
 * Date: 7-dic-2006
 * Time: 14.27.23
 * To change this template use File | Settings | File Templates.
 */
public interface RectangleI extends ImmutableRectangle {
    public void setWidth(double length);
    public void setHeigth(double length);
}
