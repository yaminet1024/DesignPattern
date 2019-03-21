package Experience_3_7;

public class StudentTicket extends AbstractTicket {
    private int money;

    public StudentTicket(int money) {
        this.money = money;
    }

    @Override
    void getTicket() {
        System.out.println("学生享受8折优惠，您的购票价格为：" + (money*0.8) + "元");
    }
}
