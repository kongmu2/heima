package collection.list.linkedlist;

import collection.list.arraylist.Dog;

import java.util.LinkedList;

public class TestDogl {
    public static void main(String[] args) {
        Dog dog1 = new Dog("小七", "柯基");
        Dog dog2 = new Dog("小八", "拉布拉多");
        Dog dog3 = new Dog("小九", "金毛");
        Dog dog4 = new Dog("小十", "吉娃娃");
        LinkedList<Dog> dogs = new LinkedList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.add(dog4);
        System.out.println("dogs.size() = " + dogs.size());

        System.out.println("第一条狗"+dogs.getFirst().getName());
        System.out.println("最后第一条狗"+dogs.getLast().getName());

        for (Dog dog : dogs) {
            System.out.println("名字:"+dog.getName()+"品种:"+dog.getStrain());
        }

    }
}
