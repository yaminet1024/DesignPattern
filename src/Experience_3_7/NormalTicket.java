package Experience_3_7;

public class NormalTicket extends AbstractTicket{
    private int money;

    public NormalTicket(int money) {
        this.money = money;
    }


    @Override
    void getTicket() {
        System.out.println("您的购票价格为：" + money + "元");
    }
}
