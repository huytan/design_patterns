package com.tonyx.lab.liskov.exerc7;


/**
 * Created by IntelliJ IDEA.
 * User: Antonio Lucca aka tonyx
 * Date: Jan 16, 2007
 * Time: 12:52:20 AM
 */
public class ColoredPositiveTridimensionalRectangle extends ColoredPositiveRectangle {
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

    public ColoredPositiveTridimensionalRectangle(double x, double y) throws RectangleException
    {
        super(x,y);
    }

    public ColoredPositiveTridimensionalRectangle(double x, double y, String color) throws RectangleException
    {
        super(x,y,color);
    }

    public ColoredPositiveTridimensionalRectangle(double x, double y, double z, String color) throws RectangleException
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

    protected boolean _navigate(Object other, boolean reversed)
    {
        if (other instanceof ColoredPositiveTridimensionalRectangle && !reversed)
        {
            return ((ColoredPositiveTridimensionalRectangle)other)._navigate(this,true);
        }
        else
        {
            if (!_compareFields(other)) return false;
            return super._navigate(other,reversed);
        }
    }

     private boolean _compareFields(Object other) {
        if (other instanceof ColoredPositiveTridimensionalRectangle) {
            ColoredPositiveTridimensionalRectangle rOther = (ColoredPositiveTridimensionalRectangle) other;
            if (this.heigth != rOther.getHeigth() || this.length != rOther.getLength() ||this.thirdDimension!=rOther.thirdDimension || this.getColor().equals(rOther.getColor()))
            {
                return false;
            }
        } else {
            if (this.thirdDimension!=0)
                return false;
        }
        return true;
    }

/*
    public boolean equals(Object other)
    {
        if (other ==null) return false;
        if (other.getClass().equals(this.getClass()))
        {
            ColoredPositiveTridimensionalRectangle cOther=  (ColoredPositiveTridimensionalRectangle)other;
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
*/
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
/*
    public boolean equals(RectangleI rOther)
    {
        return this.getZ()==DEFAULT_Z &&super.equals(rOther);
    }
*/


/*

    public int compareTo(Object object)
    {
        if (object==null)
        {
            throw new NullPointerException("unallowed null type for compareTo");
        }
        if (!(object instanceof RectangleI))
        {
            throw new ClassCastException("");
        }
        if (this.getClass().equals(object.getClass()))
        {
            ColoredPositiveTridimensionalRectangle cptOther = (ColoredPositiveTridimensionalRectangle)object;
            if (this.getZ()==cptOther.getZ())
            {
                return super.compareTo(cptOther);
            }
            else
            {
                return (this.getZ()>cptOther.getZ()?1:-1);
            }

        } else
        {
            if (Utils.isHerarchicallySubClass(this.getClass(),object.getClass()))
            {
                return -(((RectangleI)object).compareTo(this));
            }
            if (this.getZ()>0)
            {
                return 1;
            } else
            {
                return super.compareTo(object);
            }

        }
    }
*/
}
