package Experience_3_4;

/**
 * 中介者模式实例之虚拟聊天室
 * 在“虚拟聊天室”实例中增加一个新的具体聊天室类和一个新的具体会员类，要求如下：
 * （1） 新的具体聊天室中发送的图片大小不得超过20
 * （2） 新的具体聊天室中发送的文字信息的长度不得超过100个字符，提供更强大的不雅字符过滤功能（如可过滤TMD、“操”等字符）。
 * （3） 新的具体会员类可以发送图片信息和文字信息。
 * （4） 新的具体会员类在发送文本信息时，可以在信息后加上发送时间，格式为：文本信息（发送时间）。
 * 修改客户端测试类，注意原有系统类库代码和客户端代码的改变。
 */

public class Client {
    public static void main(String[] args) {
        Member member,member1,member2;
        member = new NormalMember("张三");
        member1 = new VIPMember("李四");
        member2 = new NewMember("王五");

        AbstractChatroom chatroom = new NewGroup();
        chatroom.register(member);
        chatroom.register(member1);
        chatroom.register(member2);

        member.sendText("李四","李四，你TMD");
        member.sendImage("李四","hello");

        member1.sendText("张三","操");
        member1.sendImage("张三","fuck");

        member2.sendText("张三","fuck");
        member2.sendImage("李四","hello");
    }
}
