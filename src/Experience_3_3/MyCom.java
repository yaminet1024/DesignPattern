package Experience_3_3;

public class MyCom implements Commodity {

    @Override
    public CommodityIterator createIterator() {
        return new MyComIterator();
    }

    private class MyComIterator implements CommodityIterator{

        private String[] commodities = {"手机","电脑","包包","口红","香水"};

        private int index = 0;

        @Override
        public void setChannel(int i) {
            index = i;
        }

        @Override
        public void next() {
            if (!isLast()){
                index++;
            }
        }

        @Override
        public void previous() {
            if (!isFirst()){
                index--;
            }
        }

        @Override
        public String currentChannel() {
            return commodities[index];
        }

        @Override
        public boolean isFirst() {
            return index==0;
        }

        @Override
        public boolean isLast() {
            return index==commodities.length-1;
        }
    }
}
