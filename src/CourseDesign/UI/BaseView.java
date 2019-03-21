package CourseDesign.UI;

import CourseDesign.Utils.JFrameController;

import javax.swing.*;
import java.awt.*;

public abstract class BaseView {
    JFrame jFrame;


    //创建默认视图所需要的代码
    protected void onCreateView(){
        jFrame = new JFrame();
        jFrame.setIconImage(new ImageIcon("src\\main\\resources\\icon.jpg").getImage());
        jFrame.setSize(1200,880);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
    }

    //第一次运行对数据进行初始化
    protected  void onStart(){
    }

    //视图处于后台不可见状态
    protected void onPause(){}
    //完成视图的创建
    protected  void onCreate(){

    }

    protected void onRestart(){
        jFrame.setVisible(true);
    }

    //关闭界面，该界面出栈
    protected void onDestory(){
        JFrameController.removeFrame(jFrame);
    }

    //用于展示视图
    public void show(){
        onCreateView();
        onStart();
        onCreate();
        jFrame.setVisible(true);
    }

    //打开新的视图并且把视图添加到栈里面
    protected void startNewView(BaseView baseView){
        jFrame.setVisible(false);
        baseView.show();
        JFrameController.addFrame(baseView.jFrame);
    }
}
