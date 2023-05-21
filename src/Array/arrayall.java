package Array;

import org.junit.Test;

public class arrayall {

    public static void main(String[] args) {
        int[] a=new int[]{1,32,5,312,54};
        System.out.println(a.hashCode());
        System.out.println(System.identityHashCode(a));
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
//        for (int i : a) {
//            System.out.println(i);
//        }
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}
