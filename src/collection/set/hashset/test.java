package collection.set.hashset;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;

public class test {
    @Test
    public void test(){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("张三");
        hashSet.add("李四");
        hashSet.add("王五");
        for (String s : hashSet) {
            System.out.println(s);
        }


        hashSet.add("abc");
        hashSet.add("ab");
        hashSet.remove("a");
        hashSet.add("c");

        System.out.println("hashSet.contains(\"abc\") = " + hashSet.contains("abc"));

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String s : hashSet) {
            System.out.println(s);
        }

        hashSet.clear();
        System.out.println(hashSet);
    }

    @Test
    public void test1(){
        HashSet<String > hashSet = new HashSet<>();
        hashSet.add("abc");
        hashSet.add("efg");
        hashSet.add("hij");
        for (String s : hashSet) {
            System.out.println(s);
        }
    }
}
