package InnerClass.anonymity;

import InnerClass.innerthis.OuterClass;

public class OutClass {
    private String name="yqc";
    private int age=10;
    A a=new A() {
        @Override
        public void m() {
            System.out.println("OutClass.m([])方法"+name+age);
        }
    };

    public static void main(String[] args) {
        OutClass outerClass = new OutClass();
        outerClass.a.m();
    }
}
