package com.tonyx.lab.liskov.exerc7;


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

/*
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final RectangleImpl rectangle = (RectangleImpl) o;

        if (Double.compare(rectangle.heigth, heigth) != 0) return false;
        if (Double.compare(rectangle.length, length) != 0) return false;

        return true;
    }

    public int hashCode() {
        int result;
        long temp;
        temp = heigth != +0.0d ? Double.doubleToLongBits(heigth) : 0L;
        result = (int) (temp ^ (temp >>> 32));
        temp = length != +0.0d ? Double.doubleToLongBits(length) : 0L;
        result = 29 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
*/




    private boolean _compareFields(Object other)
    {
        if (other instanceof RectangleI )
        {
            RectangleImpl rOther = (RectangleImpl)other;
            if (this.heigth!=rOther.getHeigth()||this.length!=rOther.getLength())
            {
                return false;
            }
            else return true;
        } else
            return false;
    }


    public int hashCode()
    {
          return ((int)this.getHeigth()%31+(int)this.getLength());
    }



    public boolean equals(Object other)
    {
        if (other == null) return false;
        if (other == this) return true;
        if (!(other instanceof RectangleImpl)) return false;
        return _navigate(other,false);
    }

    protected boolean _navigate(Object other, boolean reversed)
    {
        if (other instanceof RectangleImpl && !reversed)
        {
            return ((RectangleImpl)other)._navigate(this,true);
        }
        else
        {
            if(!_compareFields(other)) return false;
            return true;
        }

    }






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

   /*
    public int compareTo(Object object) {
        if (object == null)
            throw new NullPointerException("null parameter");
        if (!(object instanceof RectangleI)) {
            throw new ClassCastException("Object "+object.toString()+" is not an instance of RectangleI");
        }
        if (this.equals(object))
            return 0;

        if (Utils.isHerarchicallySubClass(object.getClass(),this.getClass()))
            return -((RectangleI)object).compareTo(this);

        RectangleI rother = (RectangleI)object;
        return (this.getHeigth()*this.getHeigth()>rother.getHeigth()*rother.getHeigth()?1:-1);
    }
    */

}
