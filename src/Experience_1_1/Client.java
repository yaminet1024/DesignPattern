package Experience_1_1;

/**
 * 简单工厂模式
 * 实现一个简单计算器，要求建立7个类：包括1个操作父类、4个加减乘除操作子类、1个工厂类、1个测试类，具体绘制类图并编程实现。
 */
public class Client{
    public static void main(String[] args) {
        Operation operation = new Operation("/");
        Father father = operation.getResult();
        if(father!=null){
            try {
                System.out.println(father.getResult(4,0));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}