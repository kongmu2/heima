package collection.list.vector;

import org.junit.Test;

import java.util.Iterator;
import java.util.Vector;

public class testv {
    @Test
    public void testv(){
        Vector<String > vector = new Vector<>();
        vector.add("yqc");
        vector.add("zrh");
        vector.addElement("jsdhajksd");
        vector.addElement("sbzrh");
        System.out.println(vector);
        vector.set(1,"张荣浩");
        System.out.println(vector);


        System.out.println("vector.get(2) = " + vector.get(2));

        for (String s : vector) {
            System.out.println(s);
        }

        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
