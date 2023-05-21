package method;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("姓名:"+this.name);
        System.out.println("年龄:"+this.age);
    }

    public static void main(String[] args) {
        Person p1=new Person("刘翔",44);
        p1.display();

    }
}
