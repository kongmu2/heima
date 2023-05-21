package Exception;

public class throwec {
    public static void main(String[] args) {
//        try {
//            int a=10;
//            int b=0;
//            System.out.println(a / b);
//
//
//        }catch (ArithmeticException e) {
//            e.printStackTrace();
//            System.out.println("算术异常" + e.getMessage());
//        }finally {
//            System.out.println("finaly");
//        }
//        System.out.println("f");


        try {
            d(1,0);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("catch"+e.getMessage());
        }
        System.out.println("finish");
    }
    public static void d(int a,int b) throws Exception {
        if (b==0){
            throw new Exception("除数为0");
        }
        System.out.println(a/b);
    }
}
