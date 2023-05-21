package heima.test1.treeSet;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class demotreeset {
    public static void main(String[] args) {
        Set<Integer> set=new TreeSet<>();
        set.add(23);
        set.add(3);
        set.add(673);
        set.add(33);
        set.add(77);
        System.out.println(set);

        Set<String> set1=new TreeSet<>();
        set1.add("Java");
        set1.add("Add");
        set1.add("Background");
        set1.add("黑马");
        set1.add("abc");
        System.out.println(set1);
        //Comparable类比较器
        Set<obj> set2=new TreeSet<>();
        set2.add(new obj("张浩",19,"前端"));
        set2.add(new obj("李四",16,"前端"));
        set2.add(new obj("王五",39,"前端"));
        System.out.println(set2);

        //treeset自带比较器对象
        Set<obj> set3=new TreeSet<>(new Comparator<obj>() {
            @Override
            public int compare(obj o1, obj o2) {
                return 0;
            }
        });
        set3.add(new obj("张浩",19,"前端"));
        set3.add(new obj("李四",16,"前端"));
        set3.add(new obj("王五",39,"前端"));
        System.out.println(set3);
        sum( 10);
        sum(20);
        sum(new int[]{1,2,3,4});
    }
    //可变参数  可变参数必须放在形参列表的最后面
    public static void sum(int ... num){
        System.out.println("元素数量"+num.length);
        System.out.println("元素内容"+ Arrays.toString(num));
    }
}
