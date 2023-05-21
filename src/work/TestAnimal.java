package work;

import java.util.ArrayList;
import java.util.List;

public class TestAnimal {
    public static void main(String[] args) {
        Animal[] as =new Animal[]{
                new Dog("Pluto"),
        new Cat("Tom"),
        new Dog("Snoopy"),
        new Cat("Garfield")
        };
        Dog[] dogs=getAllDog(as);

        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i].getName());
        }

    }
    public static Dog[] getAllDog(Animal[] animals){


        int count=0;
        for (Animal animal : animals) {
            if (animal instanceof Dog){
                count++;
            }
        }
        Dog[] dogs =new Dog[count];

        int i=0;
        for (Animal animal : animals) {
            if (animal instanceof Dog){
                dogs[i]=(Dog) animal;
                i++;
            }
        }
        return dogs;
    }
}
