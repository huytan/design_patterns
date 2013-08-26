package com.tonyx.lab.liskov.exerc6;


/**
 * Created by IntelliJ IDEA.
 * User: Antonio Lucca aka tonyx
 * Date: 11-dic-2006
 * Time: 23.38.04
 * To change this template use File | Settings | File Templates.
 */
public class RectangleImpl implements RectangleI {
    protected double heigth;
    protected double length;

    public RectangleImpl() {
    }


    public int hashCode()
    {
          return ((int)this.getHeigth()%31+(int)this.getLength());
    }

    public boolean equals(Object other) {
       if (other instanceof RectangleI) {
           if (Utils.isHerarchicallySubClass(other.getClass(),this.getClass())) {
               return other.equals(this);
           }
           else {
               RectangleI rOther = (RectangleI) other;
               return  (rOther.getHeigth() == this.getHeigth() && rOther.getLength() == this.getLength());
           }
       } else
            return false;
    }

/*
    public boolean equals(RectangleI rOther)
    {
        return  (rOther.getHeigth() == this.getHeigth() && rOther.getLength() == this.getLength());
    }
*/

    public double getLength() {
        return length;
    }

    public double getHeigth() {
        return heigth;
    }

    public RectangleImpl(double heigth, double length) throws RectangleException
    {
        setHeigth(heigth);
        setLength(length);
    }

    public void setHeigth(double heigth) throws RectangleException{
        if (heigth<0) throw new RectangleException("unallowed negative type");
        this.heigth=heigth;
    }

    public void setLength(double length) throws RectangleException{
        if (length<0) throw new RectangleException("unallowed negative type");
        this.length=length;
    }
}
