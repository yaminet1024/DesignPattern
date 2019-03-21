package Experience_2_6;

public class Proxy extends Subject {
    private RealSubject subject = new RealSubject();

    @Override
    void method() {
        System.out.println("方法method()被调用，调用时间为2012-10-10 10：10：10");
        try{
            subject.method();
            System.out.println("方法method()调用成功");
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("方法method()调用失败");
        }
    }
}
