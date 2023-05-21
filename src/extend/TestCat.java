package extend;

public class TestCat {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.catchmouse();

        //向下转型
        Animal animal=new Dog();
        if (animal instanceof Dog){
            Dog d1=(Dog) animal;
            d1.watchhouse();
        }


    }
}
