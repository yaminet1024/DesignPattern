package Experience_2_4;

/**
 * 装饰模式实例之界面显示构件库
 * 某软件公司基于面向对象技术开发了一套图形界面显示构件库VisualComponent。在使用该库构建某图形界面时，用户要求为界面定
 * 制一些特效显示效果，如带滚动条的窗体或透明窗体等。现使用装饰模式设计该构件库，绘制类图并编程模拟实现。
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ScrollBarDecorator(new VisualComponent());
        component.visit();
        component = new TranComponent(new VisualComponent());
        component.visit();
    }

}
