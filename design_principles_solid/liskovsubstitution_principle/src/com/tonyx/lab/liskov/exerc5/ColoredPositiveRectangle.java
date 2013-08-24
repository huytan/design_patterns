package com.tonyx.lab.liskov.exerc5;

/**
 * Created by IntelliJ IDEA.
 * User: Antonio Lucca aka tonyx
 * Date: Jan 4, 2007
 * Time: 3:48:51 PM
 */
public class ColoredPositiveRectangle extends RectangleImpl{
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
        if (this.getColor().equals(BIANCO))
        {
            return superHash;
        } else
        return super.hashCode()+this.color.hashCode();

    }

    public String getColor()
    {
        return color;
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

    public boolean equals(Object other)
    {
        if (other == null) return false;
        if (other.getClass().equals(this.getClass())) {
            ColoredPositiveRectangle cOther = (ColoredPositiveRectangle)other;
            return super.equals(cOther)&&this.color.equals(cOther.getColor());
        }
        if (other instanceof RectangleI)
        {
            RectangleI rOther = (RectangleI)other;
            return this.color.equals(BIANCO)&&super.equals(rOther);
        }
        return false;
    }

}
