package Experience_3_8;

public abstract class DatabaseMethod {
    abstract void connDB();

    private void openDB(){
        System.out.println("打开数据库");
    }

    private void closeDB(){
        System.out.println("关闭数据库");
    }

    private void useDB(){
        System.out.println("使用数据库");
    }


    public void process(){
        connDB();
        openDB();
        useDB();
        closeDB();
    }
}
