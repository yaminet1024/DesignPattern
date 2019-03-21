package Experience_3_5;

public class Investor extends Observer {

    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void receive(int money) {
        System.out.println(name + "您好，当前股票已经价格变化幅度达到5%！,最新的价格为"+ money + "元。" );
    }
}
