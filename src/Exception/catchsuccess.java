package Exception;

public class catchsuccess {
    public static void main(String[] args) {
//        try {
//            int a=10;
//            int b=0;
//            System.out.println(a/b);
//            System.out.println("fsdgffcgh");
//        }catch (ArithmeticException e){
//            e.printStackTrace();
//            System.out.println("catch");
//        }finally {
//            System.out.println("finaly");
//        }

        try{
//            String s=null;
//            System.out.println(s.length());
            int a=10;
            int b=0;
            System.out.println(a / b);

        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("算术异常"+e.getMessage());
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("空指针异常"+e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("其他异常"+e.getMessage());
        }finally {
            System.out.println("finaly");
        }
    }
}
