package Experience_3_2;

/**
 * 命令模式实例之公告板系统
 * 某软件公司欲开发一个基于Windows平台的公告板系统。系统提供一个主菜单（Menu），在主菜单中包含了一些菜单项（MenuItem），
 * 可以通过Menu类的addMenuItem()方法增加菜单项。菜单项的主要方法是click()，每一个菜单项包含一个抽象命令类，具体命令类包
 * 括OpenCommand（打开命令）、CreateCommand（新建命令）、EditCommand（编辑命令）等，命令类具有一个execute（）方法，用于
 * 调用公告板系统界面类（BoardScreen）的open()、create()、edit()等方法。现使用命令模式设计该系统，使得MenuItem类与
 * BoardScreen类的耦合度降低，绘制类图并编程模拟实现。
 */

public class Client{

    public static void main(String[] args) {
        Menu menu = new Menu();
        MenuItem item1 = new MenuItem("菜单1");
        MenuItem item2 = new MenuItem("菜单2");
        MenuItem item3 = new MenuItem("菜单3");
        menu.addMenuItem(item1);
        menu.addMenuItem(item2);
        menu.addMenuItem(item3);

        MenuItem selectItem = menu.getItem("菜单2");
        if (selectItem!=null){
            selectItem.setCommand(new BoardEdit());
            selectItem.onClick();
        }
    }
}
