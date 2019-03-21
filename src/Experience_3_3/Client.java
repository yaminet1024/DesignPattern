package Experience_3_3;

/**
 * 迭代器模式实例之商品名称遍历
 * 某商品管理系统的商品名称存储在一个字符串数组中，现需要自定义一个双向迭代器（MyIterator）实现对该商品名称数组的双向
 * （前向和后向）遍历。绘制类图并编程实现。
 */

public class Client {

    public static void main(String[] args) {
        CommodityIterator iterator = new MyCom().createIterator();
        iterator.setChannel(0);
        System.out.println("开始迭代");
        while (!iterator.isLast()){
            System.out.println(iterator.currentChannel());
            iterator.next();
        }
    }
}
