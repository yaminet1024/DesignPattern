package Experience_3_3;

public interface CommodityIterator {
    void setChannel(int i);
    void next();
    void previous();
    String currentChannel();
    boolean isFirst();
    boolean isLast();
}
