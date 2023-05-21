package suanfa.Sort;

public class insertionSort {

    /**通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应的位置并插入。
     **/
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            //插入的数
            int insertVal = arr[i];
            //被插入的位置(准备和前一个数比较)
            int index = i - 1;
            //如果插入的数比被插入的数小
            while (index >= 0 && insertVal < arr[index]) {
                //将把 arr[index] 向后移动
                arr[index + 1] = arr[index];
                //让 index 向前移动
                index--;
            }
            //把插入的数放入合适位置
            arr[index + 1] = insertVal;
        }
    }

    public static void main(String[] args) {

    }
}
