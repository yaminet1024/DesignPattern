package CourseDesign.Decorator;

import CourseDesign.Shape.BaseShape;

import java.awt.*;

public abstract class FillDecorator  {

    private BaseShape baseShape;

    public FillDecorator(BaseShape baseShape) {
        this.baseShape = baseShape;
    }

    public abstract void draw(Graphics2D graphics);


}
