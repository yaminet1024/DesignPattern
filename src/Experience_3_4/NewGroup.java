package Experience_3_4;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class NewGroup extends AbstractChatroom {

    HashMap members = new HashMap();

    @Override
    public void register(Member member) {
        if (!members.containsValue(member)){
            member.setChatroom(this);
            members.put(member.getName(),member);
        }

    }

    @Override
    public void sendText(String from, String to, String message) {
        if (message.length()>100){
            System.out.println("不能发送超过100个字符");
        }else {
            //TODO 正则表达式
            message = message.replaceAll("TMD","*").replaceAll("操","*");
            Member member = (Member) members.get(to);
            member.receviedText(from,message);
        }
    }

    @Override
    public void sendImage(String from, String to, String image) {
        if (image.length() > 20){
            System.out.println("不能发送超过大于20的图片");
        }else {
            Member member = (Member) members.get(to);
            member.receivedImage(from,image);
        }
    }
}
