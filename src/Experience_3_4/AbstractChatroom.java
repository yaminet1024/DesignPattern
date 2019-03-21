package Experience_3_4;

public abstract class AbstractChatroom {
    public abstract void register(Member member);
    public abstract void sendText(String from,String to,String Message);
    public abstract void sendImage(String from,String to,String image);
}
