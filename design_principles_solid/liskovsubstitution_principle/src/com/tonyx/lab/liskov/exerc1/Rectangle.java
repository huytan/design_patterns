package com.tonyx.lab.liskov.exerc1;
/**
 * this examples shows an implementation of rectangle not compliant with
 * the liskov substitution principle
 *
 *
 *
 */


/**
 * Created by IntelliJ IDEA.
 * User: Antonio Lucca aka tonyx
 * Date: 6-dic-2006
 * Time: 21.58.09
 * To change this template use File | Settings | File Templates.
 */
public class Rectangle {
    double width;
    double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean equals(Object other)
    {
        if (other ==null)
            return false;

        if (other instanceof Rectangle)
        {
            Rectangle rOther = (Rectangle)other;
            return rOther.getLength()==this.getLength()&&rOther.getWidth()==this.getWidth();
        }
        return false;
    }

    public String toString()
    {
         return this.getClass().toString()+": [width = "+this.getWidth()+"] "+" [length = "+this.getLength()+"]";
    }

}
