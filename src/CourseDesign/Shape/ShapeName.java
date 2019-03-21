package CourseDesign.Shape;

public enum ShapeName {

    LINE(1000,"直线"),
    CIRCLE(1001,"圆形"),
    RECTANGLE(1002,"矩形"),
    TRIANGLE(1003,"三角形"),
    RIGHT_TRIANGLE(1004,"直角三角形");



    private int shapeCode;
    private String shapeName;

    ShapeName(int shapeCode, String shapeName) {
        this.shapeCode = shapeCode;
        this.shapeName = shapeName;
    }

    public int getShapeCode() {
        return shapeCode;
    }

    public String getShapeName() {
        return shapeName;
    }
}
