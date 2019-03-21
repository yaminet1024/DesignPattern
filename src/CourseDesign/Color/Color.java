package CourseDesign.Color;

import java.awt.*;
import java.io.Serializable;

public abstract class Color implements Cloneable, Serializable {
    abstract public void paint(Graphics2D graphics);

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
