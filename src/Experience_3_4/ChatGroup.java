package Experience_3_4;

import java.util.HashMap;
import java.util.Hashtable;

public class ChatGroup extends AbstractChatroom {

    private HashMap members = new HashMap();

    @Override
    public void register(Member member) {
        if (!members.containsValue(member)){
            member.setChatroom(this);
            members.put(member.getName(),member);
        }
    }

    @Override
    public void sendText(String from, String to, String Message) {
        Member member = (Member) members.get(to);
        Message = Message.replaceAll("日","*");
        member.receviedText(from,Message);
    }

    @Override
    public void sendImage(String from, String to, String image) {
        Member member = (Member) members.get(to);
        if (image.length()>5){
            System.out.println("图片太大，不能发送");
            return;
        }
        member.receivedImage(from,image);
    }
}
