package CourseDesign.Shape;

import java.awt.*;

public class Rectangle extends BaseShape {
    @Override
    public void draw(Graphics2D graphics) {
        if (color !=null){
            color.paint(graphics);
        }else if (color1!=null){
            graphics.setColor(color1);
        }
        else {
            graphics.setColor(Color.BLACK);
        }
        graphics.drawRect(x1,y1,x2-x1,y2-y1);
    }

    @Override
    public String toString() {
        return "矩形{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                '}';
    }
}
