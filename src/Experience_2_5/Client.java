package Experience_2_5;

import java.io.IOException;

/**
 * 外观模式实例之文件加密
 * 某系统需要提供一个文件加密模块，加密流程包括三个操作，分别是读取源文件、加密、保存加密之后的文件。读取文件和保存文件
 * 使用流来实现，这三个操作相对独立，其业务代码封装在三个不同的类中。现在需要提供一个统一的加密外观类，用户可以直接使用
 * 该加密外观类完成文件的读取、加密和保存三个操作，而不需要与每一个类交互，使用外观模式设计该加密模块，要求编程模拟实现。
 */
public class Client {
    public static void main(String[] args) {
        FileFacade fileFacade = new FileFacade();
        Read read = new Read();
        System.out.println("明文密码为");
        try {
            System.out.println(read.readFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        fileFacade.run();
        System.out.println("加密密码为：");
        try {
            System.out.println(read.readFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Encryption encryption = new Encryption();
        System.out.println("解密密码为：");
        System.out.println(encryption.deEncrypt());

    }
}
