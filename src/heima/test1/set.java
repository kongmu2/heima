package heima.test1;

import java.lang.reflect.Array;
import java.util.*;

public class set {
    public static void main(String[] args) {
        Collection<String> set=new HashSet<>();
        set.add("apple");
        set.add("vivo");
        set.add("huawei");
        set.remove("vivo");
        System.out.println(set);
        System.out.println(set.contains("apple")+"\n");


        Collection<String> set1=new HashSet<>();
        set1.add("apple");
        set1.add("vivo");
        set1.add("huawei");
        set1.remove("apple");
        System.out.println(set1);
        System.out.println(set1.contains("apple")+"\n");

        Collection<String> list=new ArrayList<>();
        list.add("hotel");
        list.add("hospital");
        list.add("village");
        list.remove("village");
        System.out.println(list);
        System.out.println(list.contains("hospital")+"\n");


        Collection<String> list1=new LinkedList<>();
        list1.add("hotel");
        list1.add("hospital");
        list1.add("village");
        list1.remove("village");
        System.out.println(list1);
        System.out.println(list1.contains("hospital")+"\n");


        Object[] arr =list.toArray();
        System.out.println("数组"+Arrays.toString(arr));

        list1.addAll(list);
        System.out.println(list1);
    }
}
