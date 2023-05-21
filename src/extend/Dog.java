package extend;

public class Dog extends Animal{

    public Dog() {
    }
    public Dog(String name,int age) {
        super(name,age);
    }

    public void watchhouse(){
        System.out.println("Dog.watchhouse([])方法");
    }

}
