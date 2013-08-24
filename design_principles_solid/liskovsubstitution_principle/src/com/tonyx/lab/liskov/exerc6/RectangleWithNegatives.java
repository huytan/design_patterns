package com.tonyx.lab.liskov.exerc6;


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


// todo try to make this less rtti oriented
    public boolean equals(Object other)
    {
        if (other==null)
            return false;
        if (other instanceof RectangleWithNegatives)
        {
            RectangleWithNegatives rOther = (RectangleWithNegatives)other;
            return (this.getHeigth()==rOther.getHeigth()&&this.getLength()==rOther.getLength());
        }
        if (other.getClass().equals(this.getClass().getSuperclass()))
        {
            RectangleI rOther = (RectangleI)other;
            return (this.getHeigth()==rOther.getHeigth()&&this.getLength()==rOther.getLength());
        }
        if (Utils.isHerarchicallySubClass(other.getClass(),this.getClass().getSuperclass()))
        {
            return (other.equals(this));
        }
        return false;

    }

    /*
    public boolean equals(Object other)
    {
        if (other instanceof RectangleI)
        {
            if (Utils.isHerarchicallySubClass(other.getClass(),this.getClass()))
            {
                return other.equals(this);
            } else
            {
                return super.equals(other);
            }
        }
        return false;
    }
    */


    public void setLength(double length) throws RectangleException {
        this.length=length;
    }
}
