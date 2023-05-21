package heima.test1.collection;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.*;

public class collection {
    public static void main(String[] args) {
        Set<String> treeSet1 = new TreeSet<>();
        treeSet1.add("liuyi");
        treeSet1.add("chener");
        treeSet1.add("zhangsan");
        treeSet1.add("lisi");
        treeSet1.add("wangwu");
        treeSet1.add("zhaoliu");
        treeSet1.add("sunqi");
        treeSet1.add("zhouba");
        treeSet1.add("wujiu");
        treeSet1.add("zhengshi");

        // 遍历输出：2种方式，迭代器和foreach，没有下标方式
        // foreach方式遍历
        for (String str : treeSet1) {
            System.out.print(str + "   ");
            // chener   lisi   liuyi   sunqi   wangwu   wujiu   zhangsan   zhaoliu   zhengshi   zhouba
            // 字符串是按照字典顺序从小到大排序
        }
        System.out.println(treeSet1);
        System.out.println(treeSet1.contains("apple"));
        Iterator<String> iterator=new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public String next() {
                return null;
            }
        };
    }
}
