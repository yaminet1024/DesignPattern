package Experience_2_6;

/**
 * 代理模式实例之日志记录代理
 * 在某应用软件中需要记录业务方法的调用日志，在不修改现有业务类的基础上为每一个类提供一个日志记录代理类，在中输出日志，
 * 如在业务方法method()调用之前输出“方法method()被调用，调用时间为2012-10-10 10：10：10”，调用之后如果没有抛异常则输
 * 出方法“方法method()调用成功”，否则输出“方法method()调用失败”。在代理类中调用真实业务类的业务方法，使用代理模式设
 * 计该日志记录模块结构，绘制类图并编程模拟实现。
 */

public class Client {

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.method();
    }
}
