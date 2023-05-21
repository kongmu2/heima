package suanfa.Sort;

public class quickSort {
    /**
     * 快速排序
     *快速排序是指通过一趟排序将要排序的数据分割成独立的两部分，其中一部分的所有数据都比另外一部分的所有数据都要小，
     *  然后再按此方法对这两部分数据分别进行快速排序。整个排序过程可以递归进行，以此达到整个数据变成有序序列。
     * @param arr   需要排序的数组
     * @param start 数组的最小索引： 0
     * @param end   数组的最大索引： arr.length - 1
     * @return 排序好的数组
     */
    public static int[] quickSort(int arr[], int start, int end) {
        int pivot = arr[start];
        int i = start;
        int j = end;
        while (i < j) {
            while ((i < j) && (arr[j] > pivot)) {
                j--;
            }
            while ((i < j) && (arr[i] < pivot)) {
                i++;
            }
            if ((arr[i] == arr[j]) && (i < j)) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        if (i - 1 > start) arr = quickSort(arr, start, i - 1);
        if (j + 1 < end) arr = quickSort(arr, j + 1, end);
        return (arr);
    }

    public static void main(String[] args) {

    }
}
