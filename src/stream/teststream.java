package stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Stream;

public class teststream {
    @Test
    public void test(){
        Student[] studentArr = new Student[]{new Student(1,"s1", 29), new Student(2,"s2", 27)};
        Stream<Student> studentStream = Arrays.stream(studentArr);
        studentStream.forEach(System.out::println);
    }
}
