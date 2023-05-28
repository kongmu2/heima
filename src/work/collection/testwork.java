package work.collection;

import org.junit.Test;

import java.util.*;

public class testwork {
    @Test
    public void test(){
        HashSet<String> strings = new HashSet<>();
        strings.add("abc");
        strings.add("efg");
        strings.add("hij");
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void teststudent(){
        Student student = new Student(1, "yqc", 45);
        Student student1 = new Student(2, "zrh", 77);
        HashMap<Integer, Student> map = new HashMap<>();
        map.put(student.getId(),student);
        map.put(student1.getId(),student1);

        for (Integer integer : map.keySet()) {
            System.out.println(map.get(integer));
        }

        Set<Map.Entry<Integer, Student>> entries = map.entrySet();
        for (Map.Entry<Integer, Student> entry : entries) {
            System.out.println(entry.getKey() + ":"+entry.getValue());
        }
    }
}
