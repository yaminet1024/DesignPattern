package CourseDesign.Shape;

import CourseDesign.Color.Color;

import java.awt.*;
import java.io.Serializable;

public abstract class BaseShape implements Cloneable, Serializable {

    public int x1 = 0,y1 = 0,x2 =0,y2 =0;

    public Color color;
    public java.awt.Color color1;

    public void setColor(Color color) {
        try {
            this.color = (Color) color.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public abstract void draw(Graphics2D graphics);

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public  void setColor(java.awt.Color color){
        if (color!=null){
            this.color1 = new java.awt.Color(color.getRGB());
        }else {
            this.color1 = java.awt.Color.BLACK;
        }
    }
}
