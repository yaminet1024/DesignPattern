package Experience_3_7;

public class ChildrenTicket extends AbstractTicket {
    private int money;

    public ChildrenTicket(int money) {
        this.money = money;
    }

    @Override
    void getTicket() {
        System.out.println("儿童享受减少10元优惠，价格为" + (money-10) + "元");
    }
}
