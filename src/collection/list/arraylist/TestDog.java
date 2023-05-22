package collection.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class TestDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog("小七", "柯基");
        Dog dog2 = new Dog("小八", "拉布拉多");
        Dog dog3 = new Dog("小九", "金毛");
        Dog dog4 = new Dog("小十", "吉娃娃");

        List<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.add(dog4);
        System.out.println("dogs.size() = " + dogs.size());
        System.out.println("所有狗:");
        for (Dog dog : dogs) {
            System.out.println("名字:"+dog.getName()+"品种:"+dog.getStrain());
        }
        System.out.println("第一条狗"+dogs.get(0).getName());
        System.out.println("最后第一条狗"+dogs.get(dogs.size()-1).getName());

        System.out.println("包含小八"+dogs.contains(dog2));

        dogs.remove(dog1);
        dogs.remove(dog4);

        System.out.println("所有狗:");
        for (Dog dog : dogs) {
            System.out.println("名字:"+dog.getName()+"品种:"+dog.getStrain());
        }



    }
}
