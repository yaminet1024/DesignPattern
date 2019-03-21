package Experience_2_3;

public abstract class File {
    public String name;
    protected void killVirus(){
        System.out.println("正在对" + name + "进行杀毒......");
    }
}
