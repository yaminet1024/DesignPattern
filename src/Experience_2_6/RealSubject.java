package Experience_2_6;

import java.util.EmptyStackException;

public class RealSubject extends Subject{

    int i = 0;

    @Override
    void method(){
        if (i == 1){
            System.out.println("正在调用系统日志.......");
        }else throw new NullPointerException();
    }
}
