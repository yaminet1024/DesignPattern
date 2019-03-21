package Experience_3_4;

public class NormalMember extends Member {

    public NormalMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String message) {
        System.out.println("普通用户发送消息：");
        chatroom.sendText(name,to,message);
    }

    @Override
    public void sendImage(String to, String image) {
        System.out.println("普通用户不能发送图片");
    }
}
