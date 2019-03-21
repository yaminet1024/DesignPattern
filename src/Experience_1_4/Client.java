package Experience_1_4;


import java.io.IOException;
import java.util.Date;

/**
 * 原型模式
 * 在某OA系统中，用户可以创建工作周报，由于某些岗位周周工作存在重复性，因此可以通过复制原有工作周报并进行局部修改来快速新建工作周报。
 */

public class Client  {
    public static void main(String[] args) {
        WeeklyLog pre = new WeeklyLog();
        pre.setTitle("第一周");
        pre.setTime(new Date());
        pre.setText("开始任务");
        System.out.println(pre.getTitle() + "工作周报：" + pre.getText() + " "+ pre.getTime().toString());
        WeeklyLog mid =  pre.shallowClone();
        mid.setTitle("第二周");
        mid.setTime(new Date());
        mid.setText("浅克隆任务中");
        System.out.println(mid.getTitle() + "工作周报：" + mid.getText() + " " + mid.getTime().toString());
        try {
            WeeklyLog over = mid.deepClone();
            over.setTitle("第三周");
            over.setTime(new Date());
            over.setText("深克隆任务完成");
            System.out.println(over.getTitle() + "工作周报：" + over.getText() + " " + over.getTime().toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
