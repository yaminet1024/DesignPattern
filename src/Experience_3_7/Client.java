package Experience_3_7;

/**
 * 策略模式实例之电影票打折
 * 某电影院售票系统为不同类型的用户提供了不同的打折方式(Discount)，学生凭学生证可以享受8折优惠(StudentDiscount)，
 * 儿童可以享受减免10元的优惠(ChildrenDiscount)，VIP用户享受半折优惠还可以进行积分(VIPDiscount)。使用策略模式设
 * 计该系统，结合场景绘制相应的类图并编码实现。
 */

public class Client {
    public static void main(String[] args) {
        BuyTicket ticket = new BuyTicket();
        ticket.buyTicket(100,BuyTicket.VIP);
    }
}
