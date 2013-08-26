package com.tonyx.lab.liskov.exerc2;

/**
 * Created by IntelliJ IDEA.
 * User: Antonio Lucca aka tonyx
 * Date: 7-dic-2006
 * Time: 12.05.00
 * To change this template use File | Settings | File Templates.
 */
public class SquareImpl implements SquareI{
    private double length;
    private double heigth;

    public SquareImpl(double length)
    {
        this.setWidth(length);
    }

    public void setWidth(double length) {
        this.length=length;
        this.heigth=length;
    }

    public void setHeigth(double heigth) {
        this.heigth=heigth;
        this.length=heigth;
    }

    public double getWidth() {
        return length;
    }

    public double getHeigth() {
        return heigth;
    }

    public boolean equals(Object other)
    {
        if (other==null) return false;
        if (other instanceof SquareI)
        {
            SquareI rOther = (SquareI)other;
            return (rOther.getWidth()==this.getWidth()&&rOther.getHeigth()==this.getHeigth());
        }

        return false;

    }

    public int hashCode()
    {
        return ((int)this.getHeigth()%31+(int)this.getWidth());
    }

    public String toString()
    {
        return this.getClass().toString()+": [length = "+this.getWidth()+"] "+" [heigth = "+this.getHeigth()+"]";
    }
}
