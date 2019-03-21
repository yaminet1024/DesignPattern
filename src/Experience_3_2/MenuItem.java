package Experience_3_2;

public class MenuItem {

    private String name;
    private Command command;

    MenuItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    void setCommand(Command command) {
        this.command = command;
    }


    void onClick(){
        System.out.println("您点击了" + name + "菜单");
        command.execute();
    }
}
