package collection.list.arraylist;

import org.junit.Test;

import java.util.*;

public class testarraylist {
    @Test
    public void testarraylist(){
        List<String> list = new ArrayList<>();
        list.add("yqc");
        list.add("yqc1");
        list.add("yqc2");
        list.add("yqc3");
        list.add("yqc4");
        list.add(2,"zrh");
        System.out.println(list);
        list.remove(2);
        list.remove("yqc3");
        System.out.println(list);

        list.set(3,"zzz");
        System.out.println(list);

        System.out.println(list.get(3));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (String s : list) {
            System.out.println(s);
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        ListIterator<String> ListIterator = list.listIterator();
        while (ListIterator.hasNext()) {
            System.out.println(ListIterator.next());
        }
        //倒序循环
        while (ListIterator.hasPrevious()) {
            System.out.println(ListIterator.previous());
        }

        List<String> list1 = new LinkedList<>();
        list1.add("yqc1");
        list1.add("yqc2");
        list.removeAll(list1);
        System.out.println(list);
        list.addAll(list1);
        System.out.println(list);

        list.clear();
        System.out.println("list = " + list);

        list1.clear();
        System.out.println("list1 = " + list1);

    }

}
