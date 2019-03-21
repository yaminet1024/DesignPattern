package CourseDesign.UI;

import CourseDesign.Shape.BaseShape;
import CourseDesign.Utils.ReadObjectFromFile;
import CourseDesign.Utils.WriteToFile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;

public class Menu {
    private JFrame jFrame;

    private List<BaseShape> baseShapes;

    private Graphics2D graphics2D;

    private JComboBox jComboBox;

    public void setjComboBox(JComboBox jComboBox) {
        this.jComboBox = jComboBox;
    }

    public void setBaseShapes(List<BaseShape> baseShapes) {
        this.baseShapes = baseShapes;
    }

    public Menu(JFrame jFrame) {
        this.jFrame = jFrame;
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(Color.WHITE);
        jFrame.setJMenuBar(menuBar);

        JMenu menuFile = new JMenu("文件(F)"), menuView = new JMenu("主页(V)"),menuEdit = new JMenu("查看(E)");
        menuFile.setUI(new MyMenuUI());
        menuFile.setMnemonic('F');
        menuEdit.setMnemonic('E');
        menuView.setMnemonic('V');
        menuView.setSelected(true);
        menuBar.add(menuFile);
        menuBar.add(menuView);
        menuBar.add(menuEdit);


        JMenuItem itemOpen = new JMenuItem("打开");
        JMenuItem itemSave = new JMenuItem("保存");
        itemSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jfc=new JFileChooser();
                jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
                jfc.showDialog(new JLabel(), "选择");
                File file=jfc.getSelectedFile();
                String fname = jfc.getName(file);
                file=new File(jfc.getCurrentDirectory(),fname+".con");
                File finalFile = file;
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        WriteToFile write = new WriteToFile(baseShapes);
                        write.write(finalFile);
                    }
                }).start();
            }
        });
        itemOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jfc=new JFileChooser();
                jfc.setFileSelectionMode(JFileChooser.FILES_ONLY );
                jfc.showDialog(new JLabel(), "选择");
                File file=jfc.getSelectedFile();
                baseShapes.clear();
                baseShapes.addAll(new ReadObjectFromFile().getList(file));
                jComboBox.removeAllItems();
                jComboBox.addItem("选择图形");
                graphics2D.clearRect(0,0,1180,680);
                for (BaseShape baseShape:baseShapes){
                    jComboBox.addItem(baseShape.toString());
                    baseShape.draw(graphics2D);
                }

            }
        });
        itemSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
        menuFile.add(itemOpen);
        menuFile.add(itemSave);

    }

    public void setG(Graphics graphics) {
        graphics2D = (Graphics2D) graphics;
    }
}
