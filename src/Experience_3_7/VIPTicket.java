package Experience_3_7;

public class VIPTicket extends AbstractTicket {
    private int money;
    private static int score;

    public VIPTicket(int money) {
        this.money = money;
    }

    @Override
    void getTicket() {
        score += money/10;
        System.out.println("VIP可以享受半折优惠，您的购票价格为：" + money/2 + "元");
        System.out.println("当前积分为" + score);
    }
}
