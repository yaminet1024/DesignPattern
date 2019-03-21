package Experience_2_1;

/**
 * 二分查找
 */

public class BinarySearch {

    private int[] numbers;
    private int value;

    public BinarySearch(int[] numbers) {
        this.numbers = numbers;
    }

    public int getValueIndex(int value){
        this.value = value;
        int index = search(0,numbers.length-1);
        return index+1;
    }

    private int search(int start,int over){
        int mid = (over-start)/2 + start;
        if (numbers[mid] == value){
            return mid;
        }
        if (start>=over){
            return -1;
        }else if (value < numbers[mid]){
            return search(0,mid-1);
        }else if (value > numbers[mid]){
            return search(mid+1,over);
        }
        return -1;
    }

}
