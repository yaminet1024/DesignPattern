package Experience_3_7;


public class BuyTicket {
    public final static int STUDENT = 1;
    public final static int CHILDREN = 2;
    public final static int VIP = 3;
    public final static int NORMAL = 4;

    public void buyTicket(int money,int type){
        switch (type){
            case STUDENT:
                new StudentTicket(money).getTicket();
                break;
            case CHILDREN:
                new ChildrenTicket(money).getTicket();
                break;
            case VIP:
                new VIPTicket(money).getTicket();
                break;
            case NORMAL:
                new NormalTicket(money).getTicket();
                break;
                default:
                    System.out.println("不支持的用户类型");
        }
    }
}
