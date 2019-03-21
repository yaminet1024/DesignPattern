package CourseDesign.Shape;

public class ShapeFactory {

    public static BaseShape getShape(ShapeName shapeName){
        if (shapeName == ShapeName.CIRCLE){
            return new Circle();
        }else if (shapeName == ShapeName.LINE){
            return new Line();
        }else if (shapeName == ShapeName.RECTANGLE){
            return new Rectangle();
        }else if (shapeName == ShapeName.TRIANGLE){
            return new Triangle();
        }else if (shapeName == ShapeName.RIGHT_TRIANGLE) {
            return new RightTriangle();
        }
        return null;
    }


}
