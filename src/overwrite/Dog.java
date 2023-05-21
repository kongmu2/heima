package overwrite;

public class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("Dog.eat([])方法");
    }
}
