package Lambda.l3;

public class Test {
    public static void main(String[] args) {
//        A a=new A() {
//            @Override
//            public int m(int a, int b) {
//                return a-b;
//            }
//        };
        A a= (a1, b) -> a1 -b;
        System.out.println("a.m(19,3) = " + a.m(19, 3));
    }
}
