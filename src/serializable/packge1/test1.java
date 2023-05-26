package serializable.packge1;

import org.junit.Test;

import java.io.*;

public class test1 implements Serializable {
    @Test
    public void testSe1() throws IOException, ClassNotFoundException {
        Objint objint = new Objint(4, 7, 9);
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("src/serializable/packge1/object1.txt"));
        oos.writeObject(objint);
        oos.flush();
        oos.close();

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("src/serializable/packge1/object1.txt"));
        Objint o = (Objint) ois.readObject();
        System.out.println("o = " + o);
        System.out.println("o.ave() = " + o.ave());

    }
}
