package Experience_1_5;

public class Singleton {
    private Singleton(){
        //doNothing
    }

    private volatile static Singleton singleton;

    public static Singleton getInstance(){
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
