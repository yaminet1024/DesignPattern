package Experience_3_8;

/**
 * 模板方法实例之数据库操作
 * 对数据库的操作一般包括连接、打开、使用、关闭等步骤，在数据库操作模板中我们定义了connDB()、openDB()、useDB()、closeDB()
 * 四个方法分别对应这四个步骤。对于不同类型的数据库(如SQLServer和Oracle)，其操作步骤都一致，只是连接数据库方法有所区别，
 * 现使用模板方法对其进行设计。
 */

public class Client {

    public static void main(String[] args) {
        DatabaseMethod mysql = new MySQL();
        mysql.process();
    }
}
