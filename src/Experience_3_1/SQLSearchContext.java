package Experience_3_1;

public class SQLSearchContext extends SearchContext {
    @Override
    void handlerRequest(TextBean text) {
        if (text.getText().contains("SQL")){
            System.out.println("已经在SQL环境下找到到指定信息");
        }else {
            System.out.println("没有在SQL环境下找到到指定信息，正在提交给UML环境......");
            if (successtor!=null){
                successtor.handlerRequest(text);
            }
        }
    }
}
