package CourseDesign.UI;

import CourseDesign.Shape.BaseShape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChooser {
    private static volatile ColorChooser ourInstance;
    private static JFrame jFrame;



    public static ColorChooser getInstance(JFrame jFrame) {
        ColorChooser.jFrame = jFrame;
        if (ourInstance ==null){
            synchronized (ColorChooser.class){
                if (ourInstance == null){
                    ourInstance = new ColorChooser();
                    return ourInstance;
                }
            }
        }
        return ourInstance;
    }

    private ColorChooser() {

    }

    public Color show(JPanel button, BaseShape shape){
        JColorChooser colorChooser = new JColorChooser();
        JDialog dialog = JColorChooser.createDialog(jFrame, "请选择颜色", false, colorChooser, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (shape!=null && colorChooser.getColor()!=null){
                    button.setBackground(colorChooser.getColor());
                    shape.setColor(colorChooser.getColor());
                    shape.color = null;
                }
            }
        }, null);
        dialog.setVisible(true);
        return colorChooser.getColor();
    }
}
