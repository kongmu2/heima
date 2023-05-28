package work.map;

import work.collection.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class teststudent {
    public static void main(String[] args) {
        work.collection.Student student = new work.collection.Student(1, "yqc", 45);
        work.collection.Student student1 = new work.collection.Student(2, "zrh", 77);
        HashMap<Integer, work.collection.Student> map = new HashMap<>();
        map.put(student.getId(),student);
        map.put(student1.getId(),student1);

        for (Integer integer : map.keySet()) {
            System.out.println(map.get(integer));
        }

        Set<Map.Entry<Integer, work.collection.Student>> entries = map.entrySet();
        for (Map.Entry<Integer, Student> entry : entries) {
            System.out.println(entry.getKey() + ":"+entry.getValue());
        }
    }
}
