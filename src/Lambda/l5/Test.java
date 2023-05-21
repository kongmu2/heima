package Lambda.l5;

public class Test {
    private String name="yqc";
    private int age=11;

    A a= () -> System.out.println("name"+name+"age"+age);

    public static void main(String[] args) {
        Test test = new Test();
        test.a.m();
    }
}
