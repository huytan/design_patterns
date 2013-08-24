package com.tonyx.lab.liskov.exerc7;


/**
 * Created by IntelliJ IDEA.
 * User: Antonio Lucca aka tonyx
 * Date: Jan 4, 2007
 * Time: 3:48:51 PM
 */
public class ColoredPositiveRectangle extends RectangleImpl {
    public final static String ROSSO="ROSSO";
    public final static String VERDER="VERDE";
    public final static String GIALLO="GIALLO";
    public final static String BIANCO="BIANCO";
    public final static String NERO="NERO";

    private String color=ColoredPositiveRectangle.BIANCO;

    public void setColor(String color)
    {
        this.color=color;
    }

    public int hashCode()
    {
        int superHash = super.hashCode();
        if (this.getColor().equals(ColoredPositiveRectangle.BIANCO))
        {
            return superHash;
        } else
        return super.hashCode()+this.color.hashCode();

    }


    protected boolean _navigate(Object other, boolean reversed)
    {
        if (other instanceof ColoredPositiveRectangle && !reversed)
        {
            return ((ColoredPositiveRectangle)other)._navigate(this,true);
        }
        else
        {
            if (!_compareFields(other)) return false;
            return super._navigate(other,reversed);
        }
    }


    private boolean _compareFields(Object other) {
        if (other instanceof ColoredPositiveRectangle) {
            ColoredPositiveRectangle rOther = (ColoredPositiveRectangle) other;
            if (this.heigth != rOther.getHeigth() || this.length != rOther.getLength() || !this.color.equals(rOther.getColor()))
            {
                return false;
            }
        } else {
            if (!this.color.equals(BIANCO))
                return false;
        }
        return true;
    }

    /*
    private boolean _compareFields(Object other)
    {
        if (Other instanceOf RectangleI)
        {
            RectangleI rOther= (RectangleI )other;
            if (this.rOther.getHeigth())


        }
    }
    */

    public String getColor()
    {
        return color;
    }

    protected ColoredPositiveRectangle()
    {

    }

    public ColoredPositiveRectangle(double heigth, double length) throws RectangleException
    {
        super(heigth,length);
    }

    public ColoredPositiveRectangle(double heigth, double length, String color) throws RectangleException
    {
        super(heigth,length);
        this.setColor(color);
    }
/*
    public boolean equals(Object other)
    {
        if (other == null) return false;
        if (other.getClass().equals(this.getClass())) {
            com.tonyx.lab.liskov.exerc7.ColoredPositiveRectangle cOther = (ColoredPositiveRectangle)other;
            return super.equals(cOther)&&this.color.equals(cOther.getColor());
        }
        if (other instanceof RectangleI)
        {

            if (Utils.isHerarchicallySubClass(other.getClass(),this.getClass()))
            {
                return other.equals(this);
            }

            RectangleI rOther = (RectangleI)other;
            return this.color.equals(ColoredPositiveRectangle.BIANCO)&&super.equals(rOther);
        }
        return false;
    }
    */

/*
    public int compareTo(Object object)
    {
        if (object==null)
            throw new NullPointerException("null object not allowed in compareTo");

        if (!(object instanceof RectangleI))
        {
            throw new ClassCastException("type mismatch for object "+object.toString());
        }

        RectangleI rother = (RectangleI)object;
        if (Utils.isHerarchicallySubClass(rother.getClass(),this.getClass()))
        {
            return -(rother.compareTo(this));

        }

        if (this.getClass().equals(object.getClass()))
        {
            ColoredPositiveRectangle cOther =  (ColoredPositiveRectangle)object;
            return this.getColor().hashCode()-cOther.getColor().hashCode();
        }

        if (!this.getColor().equals(BIANCO))
        {
            return +1;

        } else
        {
            return super.compareTo(object);
        }
    }
*/
}
