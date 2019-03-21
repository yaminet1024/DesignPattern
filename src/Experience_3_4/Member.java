package Experience_3_4;

public abstract class Member {
    protected AbstractChatroom chatroom;
    protected String name;
    public abstract void sendText(String to,String message);
    public  void receviedText(String from,String message){
        System.out.println(name + "接收到来自" + from + "的消息：" + message);
    }
    public abstract void sendImage(String to,String image);
    public  void receivedImage(String from,String image){
        System.out.println(name + "接收到来自" + from + "的图片：" + image+".jpg");
    }



    public Member(String name) {
        this.name = name;
    }

    public AbstractChatroom getChatroom() {
        return chatroom;
    }

    public void setChatroom(AbstractChatroom chatroom) {
        this.chatroom = chatroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
