package CourseDesign.Shape;

import java.awt.*;

public class Triangle extends BaseShape {
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
        int x3 = (x1+x2)/2;
        graphics.drawLine(x1, y2, x3, y1);
        graphics.drawLine( x3, y1, x2, y2);
        graphics.drawLine( x1, y2, x2, y2);
    }

    @Override
    public String toString() {
        return "三角形{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                '}';
    }
}
