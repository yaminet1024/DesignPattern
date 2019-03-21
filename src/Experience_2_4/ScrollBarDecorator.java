package Experience_2_4;

public class ScrollBarDecorator extends Decorator  {

    ScrollBarDecorator(Component component) {
        super(component);
    }

    public void visit(){
        super.visit();
        System.out.println("--------正在添加滚动条--------");
    }
}
