package serializable.externalizable;

import org.junit.Test;

import java.io.*;

public class Testexter {
    @Test
    public void test() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/serializable/externalizable/object.txt"));
        Pet pet = new Pet("小白", 8, "说句话都懒得");
        oos.writeObject(pet);
        oos.close();
    }
    @Test
    public void testread() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/serializable/externalizable/object.txt"));
        Pet o = (Pet) ois.readObject();
        System.out.println(o);
        ois.close();
    }
}
