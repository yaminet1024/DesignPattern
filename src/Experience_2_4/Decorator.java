package Experience_2_4;

public class Decorator implements Component {

    private Component component;

    Decorator(Component component){
        this.component = component;
    }

    @Override
    public void visit() {
        this.component.visit();
    }
}
