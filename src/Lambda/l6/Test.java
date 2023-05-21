package Lambda.l6;

public class Test {
    public static void main(String[] args) {
        String s="1234";
        Integer integer=new Integer(s);
        System.out.println("integer = " + integer);


        A a=Integer::valueOf;
        Integer integer1=a.createInteger(s);
        System.out.println("integer1 = " + integer1);

    }
}
