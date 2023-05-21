package heima.test1.map;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        Map<Integer,String> sites=new HashMap<>();
        sites.put(1,"huawei");
        sites.put(2,"apple");
        sites.put(3,"vivo");
        System.out.println(sites);


        Map<String,String> sites1=new HashMap<>();
        sites1.put("one","google");
        sites1.put("two","apple");
        sites1.put("three","viv");
        System.out.println(sites1);

        System.out.println(sites.get(2));
        System.out.println(sites1.get("three"));



        sites.remove(3);
        System.out.println(sites);
        sites.replace(2,"apples");
        System.out.println(sites);

        sites.replaceAll((key,value)->value.toUpperCase());//lambda表达式
        System.out.println("updated hashmap"+sites);


        System.out.println(sites.size());


        Map<Integer,String> sites2=new HashMap<>();
        sites2.put(5,"hashmap");
        sites2.putAll(sites);
        System.out.println(sites2);


        sites.clear();
        System.out.println(sites);
    }
}
