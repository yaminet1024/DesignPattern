package Experience_2_4;

public class TranComponent extends Decorator {
    TranComponent(Component component) {
        super(component);
    }

    public void visit(){
        super.visit();
        System.out.println("--------正在设置透明度--------");
    }
}
