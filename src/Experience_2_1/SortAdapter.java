package Experience_2_1;


public class SortAdapter implements DataOperation {

    private QuickSort quickSort;
    private BinarySearch binarySearch;

    @Override
    public int[] sort(int[] numberArray) {
        quickSort = new QuickSort(numberArray);
        return quickSort.getNumbers();
    }

    @Override
    public int search(int[] numberArray, int value) {
        binarySearch = new BinarySearch(numberArray);
        return binarySearch.getValueIndex(value);
    }
}
