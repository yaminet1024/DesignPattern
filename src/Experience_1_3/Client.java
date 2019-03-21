package Experience_1_3;

/**
 * 抽象工厂模式之数据库操作工厂
 * 某系统为了改进数据库操作的性能，自定义数据为连接对象(Connection)和语句(Statement)对象，可针对不同类型的数据库提供不
 * 同的连接对象和语句对象，如提供Oracle或MySQL专用连接类和语句类，而且用户可以通过配置文件等方式根据实际需要动态更换系
 * 统数据库。
 */

public class Client {
    public static void main(String[] args) {
        //创建sqllite工厂类
        FactoryFather serverFactory = new ServerFactory();
        //针对sqlite创建连接对象
        ConnectionFather server = serverFactory.createConnection();
        server.link_sql();
        //针对sqlite创建控制对象
        ControllerFather controller = serverFactory.createController();
        System.out.println( controller.execute("select * from main.Experience"));

        FactoryFather mySqlServer = new SqlFactory();
        ConnectionFather sql = mySqlServer.createConnection();
        sql.link_sql();

        ControllerFather sqlController = mySqlServer.createController();
        System.out.println(sqlController.execute("select * from dialog.log_table"));
    }

}
