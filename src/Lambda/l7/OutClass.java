package Lambda.l7;

public class OutClass {
    public void b(){
        System.out.println("绑定方法");
    }

    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        A a=outClass::b;
        a.m();
    }
}
