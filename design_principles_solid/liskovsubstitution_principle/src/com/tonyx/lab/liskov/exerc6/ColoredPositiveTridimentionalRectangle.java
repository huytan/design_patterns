package com.tonyx.lab.liskov.exerc6;

/**
 * Created by IntelliJ IDEA.
 * User: Antonio Lucca aka tonyx
 * Date: Jan 16, 2007
 * Time: 12:52:20 AM
 */
public class ColoredPositiveTridimentionalRectangle extends ColoredPositiveRectangle{
    public final static int DEFAULT_Z=0;
    private double thirdDimension= DEFAULT_Z;


    public void setZ(double z) throws RectangleException
    {
        if (z<0) throw new RectangleException("unallowed negative dim z: "+z);
        thirdDimension=z;
    }

    public double getZ()
    {
        return thirdDimension;
    }

    public ColoredPositiveTridimentionalRectangle(double x, double y) throws RectangleException
    {
        super(x,y);
    }

    public ColoredPositiveTridimentionalRectangle(double x, double y, String color) throws RectangleException
    {
        super(x,y,color); }  public ColoredPositiveTridimentionalRectangle(double x, double y, double z, String color) throws RectangleException
    {
        super(x,y,color);
        this.setZ(z);
    }


    public int hashCode()
    {
        if (this.getZ() == DEFAULT_Z)  {
            return super.hashCode();
        } else
        {
            return super.hashCode()+(int)this.getZ();
        }

    }


    public boolean equals(Object other)
    {
        if (other ==null) return false;
        if (other.getClass().equals(this.getClass()))
        {
            ColoredPositiveTridimentionalRectangle cOther=  (ColoredPositiveTridimentionalRectangle)other;
            return super.equals(cOther)&&this.thirdDimension==cOther.getZ();
        }

        if (other instanceof RectangleI)
        {
            if (Utils.isHerarchicallySubClass(other.getClass(),this.getClass()))
            {
                return other.equals(this);
            } else
            {
                RectangleI rOther = (RectangleI)other;
                return this.equals(rOther);
            }
        }
        return false;
    }

/*
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        final ColoredPositiveTridimensionalRectangle that = (ColoredPositiveTridimensionalRectangle) o;

        if (Double.compare(that.thirdDimension, thirdDimension) != 0) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = thirdDimension != +0.0d ? Double.doubleToLongBits(thirdDimension) : 0L;
        result = 29 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
*/

    public boolean equals(RectangleI rOther)
    {
        return this.getZ()==DEFAULT_Z&&super.equals(rOther);
    }



}
