package Experience_3_1;

public class JavaSearchContext extends SearchContext {
    @Override
    void handlerRequest(TextBean text) {
        if (text.getText().contains("Java")){
            System.out.println("已经在JAVA环境下找到到指定信息");
        }else {
            System.out.println("没有在JAVA环境下找到到指定信息，正在提交给SQL环境......");
            if (successtor!=null){
                successtor.handlerRequest(text);
            }
        }
    }
}
