package heima.test1.map;

import java.util.*;

public class qiantaoArray {
    public static void main(String[] args) {
        Map<String, List<String>> data=new HashMap<>();

        List<String> s1=new ArrayList<>();
        Collections.addAll(s1,"网吧","shit");
        data.put("勾八",s1);
        System.out.println(data);



        //统计选项个数
        Map<String,List<String>> vote=new HashMap<>();

        List<String> s2=new ArrayList<>();
        Collections.addAll(s2,"A","B","C");
        vote.put("王康",s2);

        List<String> s3=new ArrayList<>();
        Collections.addAll(s3,"A","B");
        vote.put("杭集",s3);
        System.out.println(vote);

        Map<String,Integer> hsv=new HashMap<>();

        Collection<List<String>> values=vote.values();
        System.out.println(values);
        for (List<String> value:values){
            for (String s:value){
                if (hsv.containsKey(s)){
                    hsv.put(s,hsv.get(s) +1);
                }else {
                    hsv.put(s,1);
                }
            }
        }
        System.out.println(hsv);

    }
}
