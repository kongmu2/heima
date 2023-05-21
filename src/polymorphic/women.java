package polymorphic;

public class women {
    public void feed(Animal animal,Food food){
        if (animal instanceof Dog){
            Dog dog=(Dog) animal;
            dog.eat(food);
        }else if (animal instanceof Cat){
            Cat cat=(Cat) animal;
            cat.eat(food);
        }else if (animal instanceof Monkey) {
            Monkey monkey = (Monkey) animal;
            monkey.eat(food);
        }
    }
}
