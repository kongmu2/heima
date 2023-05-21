package Lambda.l1;

public class OuterClass {
    public static void main(String[] args) {
//        A a =new A() {
//            @Override
//            public int m() {
//                return 10;
//            }
//        };
        A a = () -> 10;
        System.out.println("a.m() = " + a.m());
    }
}
