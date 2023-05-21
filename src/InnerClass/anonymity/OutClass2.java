package InnerClass.anonymity;

public class OutClass2 {
    private String name="yqc";
    private int age=10;
    B b=new B() {
        @Override
        void show() {
            System.out.println("OutClass2.show([])方法"+name+age);
        }
    };

    public static void main(String[] args) {
        OutClass2 outClass2=new OutClass2();
        outClass2.b.show();
    }
}
