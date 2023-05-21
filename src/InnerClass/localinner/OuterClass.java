package InnerClass.localinner;

public class OuterClass {
    private String name;
    private int age;

    public void show(){
        class InnerClass{
            public InnerClass() {
                name="杨泉城";
                age=13;
            }
            public void display(){
                System.out.println("name = " + name);
                System.out.println("age = " + age);
            }
        }
        InnerClass innerClass = new InnerClass();
        innerClass.display();
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.show();
    }
}
