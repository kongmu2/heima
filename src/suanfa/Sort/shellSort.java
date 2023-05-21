package suanfa.Sort;

public class shellSort {
    /**
     * 希尔排序 先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，待整个序列中的记录“基本有序”时，再对全体记录进行依次直接插入排序。
     * @param a
     */
    private static void shellSort(int[] a) {
        int dk = a.length / 2;
        while (dk >= 1) {
            //类似插入排序，只是插入排序增量是 1，这里增量是 dk,把 1 换成 dk 就可以了
            for (int i = dk; i < a.length; i++) {
                if (a[i] < a[i - dk]) {
                    int j;
                    int x = a[i];//x 为待插入元素
                    a[i] = a[i - dk];
                    for (j = i - dk; j >= 0 && x < a[j]; j = j - dk) {
                        //通过循环，逐个后移一位找到要插入的位置。
                        a[j + dk] = a[j];
                    }
                    a[j + dk] = x;//插入
                }
            }
            dk = dk / 2;
        }
    }

    public static void main(String[] args) {

    }
}
