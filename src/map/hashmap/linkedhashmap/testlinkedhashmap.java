package map.hashmap.linkedhashmap;

import org.junit.Test;

import java.util.LinkedHashMap;

public class testlinkedhashmap {
   @Test
    public void test(){
       LinkedHashMap<String, String> map = new LinkedHashMap<>();
       map.put("CN","中华人民共和国");
       map.put("RU","俄罗斯");
       map.put("US","美丽国");

       for (String s : map.keySet()) {
           System.out.println(map.get(s));
       }
   }
}
