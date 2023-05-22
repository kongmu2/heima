package work.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class testperson {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();

        list.add( new Person(1,"张三",23));
        list.add(new Person(2,"李四",21)) ;
        list.add(new Person(3,"王五",28)) ;
        list.add( new Person(4,"赵六",18));
        list.add(new Person(5,"火车",40)) ;

        Collections.sort(list);

        for (Person person : list) {
            System.out.println(person);
        }

    }
}
