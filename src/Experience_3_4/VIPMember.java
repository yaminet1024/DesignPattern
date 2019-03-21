package Experience_3_4;

public class VIPMember extends Member {
    public VIPMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String message) {
        System.out.println("VIP用户发送消息：");
        chatroom.sendText(name,to,message);
    }

    @Override
    public void sendImage(String to, String image) {
        System.out.println("VIP用户发送图片：");
        chatroom.sendImage(name,to,image);

    }
}
