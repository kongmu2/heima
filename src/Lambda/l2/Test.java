package Lambda.l2;

public class Test {
    public static void main(String[] args) {
//        A a=new A() {
//            @Override
//            public int m(int n) {
//                return n*10;
//            }
//        };
        A a= n -> n*10;
        System.out.println("a = " + a.m(10));
    }
}
