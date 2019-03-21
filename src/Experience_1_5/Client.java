package Experience_1_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 单例模式
 * 单例模式之多文档窗口。使用单例模式设计一个多文档窗口，要求在主窗体中某个内部子窗体只能实例化一次，即只能弹出一个相同的子窗体。
 */
public class Client {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(200,200);
        jFrame.setLayout(new GridLayout(1,1));
        JButton jButton = new JButton("单例模式");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = Dialog.getInstance();
                dialog.setSize(100,100);
                dialog.setTitle("单例模式弹出框");
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
            }
        });

        jFrame.add(jButton);
        jFrame.setVisible(true);
    }
}
