package heima.test1.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        ArrayList<String> sites=new ArrayList<>();
        sites.add("google");
        sites.add("huawei");
        sites.add("vio");
        Iterator<String> it=sites.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
        System.out.println("\n"+sites);
        for (String site : sites) {
            System.out.println(site);
        }
        sites.forEach(s -> System.out.println(s));
        sites.forEach(System.out::println);
    }
}
