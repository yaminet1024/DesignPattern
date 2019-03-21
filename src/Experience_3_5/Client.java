package Experience_3_5;

/**
 * 观察者模式实例之股票变化
 * 某在线股票软件需要提供如下功能：当股票购买者所购买的某支股票价格变化幅度达到5%时，系统将自动发送通知（包括新价格）
 * 给购买股票的股民。现使用观察者模式设计该系统，绘制类图并编程模拟实现。
 */

public class Client {
    public static void main(String[] args) {
        Shares shares = new Shares();
        Investor investor = new Investor("张三");
        Investor investor1 = new Investor("李四");
        Investor investor3 = new Investor("王五");

        shares.registerObserver(investor);
        shares.registerObserver(investor1);
        shares.registerObserver(investor3);

        shares.setMoney(102);
        shares.setMoney(150);
        shares.setMoney(40);

        shares.removeObserver(investor);

        shares.setMoney(80);

    }
}
