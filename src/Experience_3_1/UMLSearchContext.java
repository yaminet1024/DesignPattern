package Experience_3_1;

public class UMLSearchContext extends SearchContext {
    @Override
    void handlerRequest(TextBean text) {
        if (text.getText().contains("UML")){
            System.out.println("已经在UML环境下找到到指定信息");
        }else {
            System.out.println("找不到指定信息");
            if (successtor!=null){
                successtor.handlerRequest(text);
            }
        }
    }
}
