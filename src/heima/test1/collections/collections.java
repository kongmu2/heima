package heima.test1.collections;

import heima.test1.treeSet.obj;

import java.util.*;

public class collections {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        //批量添加方法
        Collections.addAll(list,"网吧","饭店","学习","炮灰");
        System.out.println(list);
        //随机打乱方法
        Collections.shuffle(list);
        System.out.println(list);
        //sort排序方法
        List<Integer> set2=new ArrayList<>();
        Collections.addAll(set2,13,2,54,34);
        Collections.sort(set2);
        System.out.println(set2);

        //Comparable类比较器
        List<obj> list1=new ArrayList<>();
        list1.add(new obj("张浩",19,"前端"));
        list1.add(new obj("李四",16,"前端"));
        list1.add(new obj("王五",39,"前端"));
        Collections.sort(list1);
        System.out.println(list1);

        //Comparator比较器
        List<obd> list2=new ArrayList<>();
        list2.add(new obd("张浩",19,"前端"));
        list2.add(new obd("李四",16,"前端"));
        list2.add(new obd("王五",39,"前端"));
        //在sort里自带的比较器
        Collections.sort(list2, new Comparator<obd>() {
            @Override
            public int compare(obd o1, obd o2) {
                return o2.getAge()-o1.getAge();
            }
        });
        System.out.println(list2);

    }
}
