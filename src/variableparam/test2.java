package variableparam;

public class test2 {
    public int sum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        test2 test2 = new test2();
        System.out.println(test2.sum(4, 7, 9));
        //形参是可变参数可以兼容实参是数组
        int[] b = new int[]{1, 5, 6};
        System.out.println(test2.sum(b));
    }
}
