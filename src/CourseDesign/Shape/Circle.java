package CourseDesign.Shape;

import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class Circle extends BaseShape {
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

        graphics.drawOval(Math.min(x1, x2), Math.min(y1, y2),Math.max(Math.abs(x1 - x2), Math.abs(y1 - y2)),
                Math.max(Math.abs(x1 - x2), Math.abs(y1 - y2)));
    }

    @Override
    public String toString() {
        return "圆形{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                '}';
    }
}
