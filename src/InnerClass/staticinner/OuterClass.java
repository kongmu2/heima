package InnerClass.staticinner;

public class OuterClass {
    private static String name="yqc";
    private int age;
    static class innerClass{
        private static String name1="杨泉城";
        public static void show(){
            System.out.println("静态方法name = " + name);
//            System.out.println("age = " + age);//静态方法无法访问非静态成员
        }
        public void show1(){
            System.out.println("非静态方法name = " + name);
//            System.out.println("age = " + age);//静态上下文无法访问非静态成员
        }

    }
    void display(){
        System.out.println("innerClass.name1 = " + innerClass.name1);
        innerClass.show();
        new innerClass().show1();
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.display();
    }
}
