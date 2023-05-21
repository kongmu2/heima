package paramtype;

public class test2 {
    public void m(int[] a){
        a[0]=100;
    }

    public static void main(String[] args) {
        test2 test2 = new test2();
        int[] a=new int[]{5,3,8,27,4};
        test2.m(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
