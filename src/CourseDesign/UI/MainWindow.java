package CourseDesign.UI;

import CourseDesign.Color.Red;
import CourseDesign.Color.Yellow;
import CourseDesign.DrawListener;
import CourseDesign.Shape.BaseShape;
import CourseDesign.Shape.Circle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;
import java.util.Timer;

public class MainWindow extends BaseView{
    private JPanel tab;
    private JPanel content;
    private Timer timer = new Timer();

    @Override
    protected void onCreate() {
        super.onCreate();
        tab = new JPanel();
        tab.setBounds(0,0,1200,120);
        tab.setLayout(new FlowLayout(FlowLayout.LEFT));
        jFrame.add(tab);
        content = new JPanel();
        content.setBackground(Color.WHITE);
        content.setBounds(8,128,1176,680);
        jFrame.add(content);
        new Menu(jFrame);
        initTab();
    }

    private void initTab(){
        JPanel tab1 = new JPanel();
        tab1.setBackground(Color.WHITE);
        tab.add(tab1);
        tab1.setPreferredSize(new Dimension(250,120));
        JButton jButton = new JButton("矩形");
        JButton jButton1 = new JButton("圆形");
        JButton jButton2 = new JButton("直角三角形");
        JButton jButton3 = new JButton("三角形");
        JButton jButton4 = new JButton("直线");
        DrawListener drawListener = new DrawListener();
        jFrame.setVisible(true);
        drawListener.setContent(content);
        jButton.addActionListener(drawListener);
        jButton1.addActionListener(drawListener);
        jButton2.addActionListener(drawListener);
        jButton3.addActionListener(drawListener);
        jButton4.addActionListener(drawListener);
        content.addMouseListener(drawListener);
        content.addMouseMotionListener(drawListener);
        tab1.add(jButton);
        tab1.add(jButton1);
        tab1.add(jButton2);
        tab1.add(jButton3);
        tab1.add(jButton4);
        JLabel jLabel = new JLabel("形状",SwingConstants.CENTER);
        jLabel.setPreferredSize(new Dimension(300,30));
        tab1.add(jLabel);


        JPanel tab2 = new JPanel();
        tab2.setBackground(Color.WHITE);
        tab.add(tab2);
        tab2.setPreferredSize(new Dimension(145,120));
        JButton jButton5 = new JButton("蓝色");
        JButton jButton6 = new JButton("绿色");
        JButton jButton7 = new JButton("红色");
        JButton jButton8 = new JButton("黄色");
        jButton5.addActionListener(drawListener);
        jButton6.addActionListener(drawListener);
        jButton7.addActionListener(drawListener);
        jButton8.addActionListener(drawListener);
        tab2.add(jButton5);
        tab2.add(jButton6);
        tab2.add(jButton7);
        tab2.add(jButton8);
        JLabel jLabe2 = new JLabel("颜色",SwingConstants.CENTER);
        jLabe2.setPreferredSize(new Dimension(300,30));
        tab2.add(jLabe2);

        JPanel tab3 = new JPanel();
        tab3.setBackground(Color.WHITE);
        tab.add(tab3);
        tab3.setPreferredSize(new Dimension(100,120));
        JPanel jLabel1 = new JPanel();
        jLabel1.setPreferredSize(new Dimension(60,75));
        jLabel1.setBackground(Color.BLACK);
        tab3.add(jLabel1);
        JLabel jLabe3 = new JLabel("颜色",SwingConstants.CENTER);
        jLabe3.setPreferredSize(new Dimension(100,30));
        tab3.add(jLabe3);
        jLabel1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (drawListener.shape != null){
                    try {
                        drawListener.shape = (BaseShape) drawListener.shape.clone();
                        jLabel1.setBackground(ColorChooser.getInstance(jFrame).show(jLabel1,drawListener.shape));
                    } catch (CloneNotSupportedException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        });

        Menu menu = new Menu(jFrame);
        menu.setBaseShapes(drawListener.getBaseShapes());
        menu.setG(content.getGraphics());

        JComboBox jComboBox = new JComboBox();
        jComboBox.addItem("选择图形");
        final Color[] color1 = new Color[1];
        final CourseDesign.Color.Color[] color = new CourseDesign.Color.Color[1];
        jComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                timer.cancel();
                timer = null;
                timer = new Timer();
                if (jComboBox.getSelectedIndex() > 0){
                    BaseShape shape1 = drawListener.getBaseShapes().get(jComboBox.getSelectedIndex() - 1);
                    if (shape1.color == null){
                        color1[0] = shape1.color1;
                    }else {
                        color[0] = shape1.color;
                    }
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            timer.schedule(new TimerTask() {
                                @Override
                                public void run() {
                                    shape1.setColor(Color.WHITE);
                                    shape1.draw((Graphics2D) content.getGraphics());
                                }
                            },0,300);
                        }
                    }).start();
                    Timer timer1 = new Timer();
                    timer1.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            if (color[0] == null){
                                shape1.setColor(color1[0]);
                            }else {
                                shape1.setColor(color[0]);
                            }
                            shape1.draw((Graphics2D) content.getGraphics());
                        }
                    },0,200);
                }
            }
        });
        drawListener.setBox(jComboBox);
        tab.add(jComboBox);
        menu.setjComboBox(jComboBox);
        content.addMouseWheelListener(drawListener);

        JComboBox<String> jComboBox1 = new JComboBox<>();
        jComboBox1.addItem("1像素");
        jComboBox1.addItem("2像素");
        jComboBox1.addItem("3像素");
        jComboBox1.addItem("4像素");
        tab.add(jComboBox1);
        jComboBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                drawListener.setStroke(jComboBox1.getSelectedIndex() + 1);
            }
        });


    }
}
