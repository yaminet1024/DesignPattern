package Experience_2_1;

/**
 * 快速排序
 */
public class QuickSort {

    private int[] numbers;

    public QuickSort(int[] numbers){
        this.numbers = numbers;
    }

    private void sort(int start,int over){
        if (start>=over){
            return ;
        }
        int index = partition(start,over);
        sort(start,index -1);
        sort(index + 1,over);
    }

    private int partition(int start,int over){
        int key = numbers[start];

        while (start<over){
            while (numbers[over]>=key && over>start){
                over--;
            }
            if (numbers[over] <= key){
                swap(over,start);
            }
            while (numbers[start]<=key && over>start){
                start++;
            }
            if (numbers[start]>=key){
                swap(start, over);
            }
        }
        return start;
    }

    private void swap(int index1,int index2){
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }

    public int[] getNumbers() {
        sort(0,numbers.length-1);
        return numbers;
    }
}
