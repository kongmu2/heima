package heima.test1.hashset;

import java.util.HashSet;
import java.util.Set;

public class hash {
    public static void main(String[] args) {
        Set<student> stu=new HashSet<>();
        student s1=new student("张浩",19,"男");
        student s2=new student("张浩",19,"男");
        student s3=new student("张三",16,"男");


        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());




        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        System.out.println(stu);
    }
}
