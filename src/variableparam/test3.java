package variableparam;

public class test3 {
    public int sum(int[] a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        test3 test3 = new test3();
        //形参是数组不可以兼容实参是可变参数
//        System.out.println(test3.sum(4, 7, 9));
    }
}
