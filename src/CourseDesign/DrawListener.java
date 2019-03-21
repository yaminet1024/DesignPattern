package CourseDesign;

import CourseDesign.Color.*;
import CourseDesign.Shape.BaseShape;
import CourseDesign.Shape.ShapeFactory;
import CourseDesign.Shape.ShapeName;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;


public class DrawListener extends MouseMotionAdapter implements ActionListener, MouseListener,MouseWheelListener {
    private Graphics2D graphics2D;
    public BaseShape shape;
    private JPanel content;
    private final List<BaseShape> baseShapes = Collections.synchronizedList(new ArrayList<>());
    private JComboBox jComboBox;


    public void setShape(BaseShape shape) {
        this.shape = shape;
    }

    public void setContent(JPanel content) {
        content.repaint();
        this.content = content;
        this.graphics2D = (Graphics2D) content.getGraphics();
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    }

    public void setStroke(int i){
        graphics2D.setStroke(new BasicStroke(i));
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        switch (action) {
            case "矩形":
                shape = ShapeFactory.getShape(ShapeName.RECTANGLE);
                break;
            case "直角三角形":
                shape = ShapeFactory.getShape(ShapeName.RIGHT_TRIANGLE);
                break;
            case "圆形":
                shape = ShapeFactory.getShape(ShapeName.CIRCLE);
                break;
            case "直线":
                shape = ShapeFactory.getShape(ShapeName.LINE);
                break;
            case "三角形":
                shape = ShapeFactory.getShape(ShapeName.TRIANGLE);
                break;
            case "红色":
                try {
                    shape = (BaseShape) shape.clone();
                    shape.setColor(new Red());
                    shape.color1 = null;
                } catch (CloneNotSupportedException e1) {
                    e1.printStackTrace();
                }
                break;
            case "黄色":
                try {
                    shape = (BaseShape) shape.clone();
                    shape.color1 = null;
                } catch (CloneNotSupportedException e1) {
                    e1.printStackTrace();
                }
                shape.setColor(new Yellow());
                break;
            case "蓝色":
                try {
                    shape = (BaseShape) shape.clone();
                    shape.color1 = null;
                } catch (CloneNotSupportedException e1) {
                    e1.printStackTrace();
                }
                shape.setColor(new Blue());
                break;
            case "绿色":
                try {
                    shape = (BaseShape) shape.clone();
                    shape.color1 = null;
                } catch (CloneNotSupportedException e1) {
                    e1.printStackTrace();
                }
                shape.setColor(new Green());
                break;
            default:
                shape = null;
                break;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (shape !=null){
            try {
                shape = (BaseShape) shape.clone();
                shape.x1 = e.getX();
                shape.y1 = e.getY();
            } catch (CloneNotSupportedException e1) {
                e1.printStackTrace();
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (shape!=null){
            baseShapes.add(shape);
            jComboBox.addItem(shape.toString());
            for (BaseShape baseShape : baseShapes){
                System.out.println(baseShape.color);
            }
            System.out.println("\n");
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        super.mouseMoved(e);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (jComboBox.getSelectedIndex()!=0){
            BaseShape shape1 = baseShapes.get(jComboBox.getSelectedIndex()-1);
            int width = Math.abs(shape1.x1-shape1.x2);
            int length = Math.abs(shape1.y1 -shape1.y2);
            shape1.x1 = e.getX();
            shape1.y1 = e.getY();
            shape1.x2 = shape1.x1 + width;
            shape1.y2 = shape1.y1 + length;
            content.update(graphics2D);
            new Thread(() -> {
                synchronized (baseShapes){
                    for (BaseShape baseShape:baseShapes){
                        if (baseShape == shape1){
                            continue;
                        }
                        baseShape.draw(graphics2D);
                    }
                }
            }).start();
            shape1.draw(graphics2D);
            shape = null;
            return;
        }

        if (shape !=null){
            shape.x2 = e.getX();
            shape.y2 = e.getY();
            content.update(graphics2D);
            new Thread(() -> {
                synchronized (baseShapes){
                    for (BaseShape baseShape:baseShapes){
                        baseShape.draw(graphics2D);
                    }
                }
            }).start();
            shape.draw(graphics2D);
        }
    }

    public List<BaseShape> getBaseShapes() {
        return baseShapes;
    }

    public void setBox(JComboBox jComboBox) {
        this.jComboBox = jComboBox;
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        if (e.getWheelRotation() == 1){
            //缩小
            if (jComboBox.getSelectedIndex()!=0){
                BaseShape shape1 = baseShapes.get(jComboBox.getSelectedIndex()-1);
                int width = (int) (Math.abs(shape1.x1-shape1.x2) * 1.1);
                int length = (int) (Math.abs(shape1.y1 -shape1.y2) * 1.1);
                shape1.x2 = shape1.x1 + width;
                shape1.y2 = shape1.y1 + length;
                content.update(graphics2D);
                new Thread(() -> {
                    synchronized (baseShapes){
                        for (BaseShape baseShape:baseShapes){
                            if (baseShape == shape1){
                                continue;
                            }
                            baseShape.draw(graphics2D);
                        }
                    }
                }).start();
                shape1.draw(graphics2D);
                shape = null;
                return;
            }
        }else {

            if (jComboBox.getSelectedIndex()!=0){
                BaseShape shape1 = baseShapes.get(jComboBox.getSelectedIndex()-1);
                int width = (int) (Math.abs(shape1.x1-shape1.x2) * 0.9);
                int length = (int) (Math.abs(shape1.y1 -shape1.y2) * 0.9);
                shape1.x2 = shape1.x1 + width;
                shape1.y2 = shape1.y1 + length;
                content.update(graphics2D);
                new Thread(() -> {
                    synchronized (baseShapes){
                        for (BaseShape baseShape:baseShapes){
                            if (baseShape == shape1){
                                continue;
                            }
                            baseShape.draw(graphics2D);
                        }
                    }
                }).start();
                shape1.draw(graphics2D);
                shape = null;
                return;
            }

        }
    }
}
