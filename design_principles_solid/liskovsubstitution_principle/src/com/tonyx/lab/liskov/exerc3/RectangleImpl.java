package com.tonyx.lab.liskov.exerc3;

/**
 * Created by IntelliJ IDEA.
 * User: Antonio Lucca aka tonyx
 * Date: 7-dic-2006
 * Time: 14.29.25
 * To change this template use File | Settings | File Templates.
 */
public class RectangleImpl implements RectangleI {
    private double length;
      private double heigth;

      public RectangleImpl(double length,double heigth)
      {
          this.setWidth(length);
          this.setHeigth(heigth);
      }

      public void setWidth(double length) {
          this.length=length;
      }

      public void setHeigth(double heigth) {
          this.heigth=heigth;
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
          if (other instanceof ImmutableRectangle)
          {
              ImmutableRectangle rOther = (ImmutableRectangle)other;
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
