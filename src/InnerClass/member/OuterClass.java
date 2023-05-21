package InnerClass.member;

public class OuterClass {
    private String name;
    private int age;
    public class innerClass{
        public innerClass() {
            name="yqc";
            age=11;
        }
        public void show(){
            System.out.println("name = " + name);
            System.out.println("age = " + age);
        }

    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        innerClass innerClass = outerClass.new innerClass();

        innerClass.show();
    }
}
