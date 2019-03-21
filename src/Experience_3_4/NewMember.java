package Experience_3_4;

import java.util.Calendar;
import java.util.Date;

public class NewMember extends Member {
    public NewMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String message) {
        System.out.println("新用户发送消息：");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        message = message + "(" + calendar.getTime() + ")";
        chatroom.sendText(name,to,message);
    }

    @Override
    public void sendImage(String to, String image) {
        System.out.println("新用户发送图片：");
        chatroom.sendImage(name,to,image);
    }
}
