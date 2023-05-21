package heima.test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Collections.addAll(list,"草马","草","草雷姆","狗霸王");
        System.out.println(list);

        //从集合中找出第一个是草的
        List<String> cao=new ArrayList<>();
        for (String name : list) {
            if (name.startsWith("草")){
                cao.add(name);
            }
        }
        System.out.println(cao);


        //找出长度为三的名称
        List<String> three=new ArrayList<>();
        for (String name : list) {
            if (name.length()==3){
                three.add(name);
            }
        }
        System.out.println(three);
    }
}
