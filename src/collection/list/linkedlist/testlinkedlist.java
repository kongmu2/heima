package collection.list.linkedlist;

import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedList;

public class testlinkedlist {
    @Test
    public void test(){
        LinkedList<String> LinkedList = new LinkedList<>();
        LinkedList.add("sdkajwk");
        LinkedList.add("yqc");
        LinkedList.add("sdkajwk1");
        System.out.println(LinkedList);
        LinkedList.remove("sdkajwk1");
        System.out.println(LinkedList);
        System.out.println(LinkedList.indexOf("yqc"));

        LinkedList.addFirst("dddd");
        System.out.println(LinkedList);
        LinkedList.addLast("llll");
        System.out.println(LinkedList);
        System.out.println("LinkedList.getFirst() = " + LinkedList.getFirst());
        System.out.println("LinkedList.getLast() = " + LinkedList.getLast());
        LinkedList.removeFirst();
        LinkedList.removeLast();
        System.out.println(LinkedList);

        for (String s : LinkedList) {
            System.out.println(s);
        }

        Iterator<String> iterator = LinkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        LinkedList.remove(1);
        LinkedList.set(2,"狗泉");
        System.out.println("LinkedList = " + LinkedList);

        LinkedList<String > linkedList1 = new LinkedList<>();
        linkedList1.add("多少斤啊");
        linkedList1.add("第三课");
        LinkedList.addAll(linkedList1);
        System.out.println(LinkedList);




    }
}
