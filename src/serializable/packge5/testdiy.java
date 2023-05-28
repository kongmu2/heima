package serializable.packge5;

import org.junit.Test;

import java.io.*;

public class testdiy {
    @Test
    public void test() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/serializable/packge5/a.txt"));
        Cat cat = new Cat("小黑", 7, "大家奥斯卡机电科技");
        oos.writeObject(cat);
        oos.close();
    }
    @Test
    public void testread() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/serializable/packge5/a.txt"));
        Cat o = (Cat)ois.readObject();
        System.out.println(o);
        ois.close();
    }
}
