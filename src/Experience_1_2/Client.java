package Experience_1_2;

/**
 * 工厂方法模式日志记录器
 * 某系统日志记录器要求支持多种日志记录方式，如文件日志记录(FileLog)、数据库日志记录(DatabaseLog)等，
 * 且用户可以根据要求动态选择日志记录方式，现使用工厂模式设计该系统。
 */

public class Client {
    public static void main(String[] args) {
        //读取文件日志
        Factory factory = new Factory("D:\\");
        LogFather father = factory.getLog();
        System.out.println(father.LogView("D:\\projects\\上课实验\\DesignPattern\\src\\Experience_1_2\\log.txt"));
        //读取MySql日志
        Factory mySql = new Factory("jdbc:mysql");
        LogFather father1 = mySql.getLog();
        System.out.println(father1.LogView("jdbc:mysql://localhost:3306/dialog"));
    }
}
