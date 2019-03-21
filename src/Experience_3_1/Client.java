package Experience_3_1;

/**
 * 职责链模式实例之在线文档帮助系统
 * 某公司欲开发一个软件系统的在线文档帮助系统，用户可以在任何一个查询环境中输入查询关键字，如果当前查询环境下没有相关
 * 内容，则系统会将查询按照一定的顺序转发给其他查询环境。设查询环境如下：JavaSearchContext、SQLSearchContext、
 * UMLSearchContext。
 */

public class Client {
    public static void main(String[] args) {
        JavaSearchContext javaSearchContext = new JavaSearchContext();
        SQLSearchContext sqlSearchContext = new SQLSearchContext();
        UMLSearchContext umlSearchContext = new UMLSearchContext();
        javaSearchContext.setSuccesstor(sqlSearchContext);
        sqlSearchContext.setSuccesstor(umlSearchContext);

        TextBean textBean = new TextBean();
        textBean.setName("语句1");
        textBean.setText("UML:Hello World");

        javaSearchContext.handlerRequest(textBean);

    }
}
