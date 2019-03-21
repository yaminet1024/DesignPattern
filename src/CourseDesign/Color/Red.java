package CourseDesign.Color;

import java.awt.*;
import java.io.Serializable;

public class Red extends Color {

    @Override
    public void paint(Graphics2D graphics) {
        graphics.setColor(java.awt.Color.RED);
    }
}
