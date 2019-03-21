package Experience_2_1;

/**
 * 适配器模式实例之算法适配
 * 现有一个接口DataOperation定义了排序方法sort(int[])和查找方法search(int[],int)，已知类QuickSort的quickSort(int[])方法
 * 实现了快速排序算法，类BinarySearch的binarySearch(int[],int)方法实现了二分查找算法。现使用适配器模式设计一个系统，在不
 * 修改源代码的情况下将类QuickSort和类BinarySearch的方法适配到DataOperation接口中。绘制类图并编程实现。
 */

public class Client {

    public static void main(String[] args) {
        int[] numbers = {8,7,6,6,5,5,3,2,1,0,4};
        SortAdapter adapter = new SortAdapter();
        numbers = adapter.sort(numbers);
        System.out.println("排序结果为");
        for (int a : numbers){
            System.out.print(a);
            System.out.print(" ");
        }
        System.out.print("\n");
        System.out.println("3的索引为：" + adapter.search(numbers,3));
    }
}
