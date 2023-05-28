package serializable.packge4;

import org.junit.Test;

import java.io.*;

public class Testmain {
    @Test
    public void test()throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/serializable/packge4/a.txt"));
        Book book = new Book("java", 89);
        Student student = new Student("yqc", 22, book);

        oos.writeObject(student);
        oos.close();
    }

    @Test
    public void testread() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/serializable/packge4/a.txt"));
        Student o =(Student) ois.readObject();
        System.out.println(o);
        ois.close();
    }
}
