package collection.set.treeset;

import org.junit.Test;

import java.util.Comparator;
import java.util.TreeSet;

public class test {
    @Test
    public void testsplit(){
        String str="8 10 15 5 2 7";
        String[] s = str.split(" ");
        TreeSet<Integer> strings = new TreeSet<>();
        for (String s1 : s) {
            strings.add(Integer.valueOf(s1));
        }
        System.out.println(strings);
    }
    @Test
    public void test2(){
        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length()!=o2.length()){
                    return Double.compare(o1.length(),o2.length());
                }else {
                    return o1.compareTo(o2);
                }

            }
        });
        treeSet.add("xiaoqiang");
        treeSet.add("zhangsan");
        treeSet.add("lisi");
        treeSet.add("xiaohua");
        treeSet.add("ruhua");
        treeSet.add("wangcai");

        for (String s : treeSet) {
            System.out.println(s);
        }
    }

}
