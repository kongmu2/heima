package serializable.packge3;

import org.junit.Test;

import java.io.*;

public class teststu {
    @Test
    public void test()throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/serializable/packge3/student.txt"));
        oos.writeObject(new Student("sdhajkd",12));
        oos.writeObject(new Student("libon",19));
        oos.writeObject(new Student("yqc",22));
        oos.close();
    }
    @Test
    public void testread() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/serializable/packge3/student.txt"));
        Student stu1 = (Student) ois.readObject();
        Student stu2 = (Student) ois.readObject();
        Student stu3 = (Student) ois.readObject();

        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println(stu3);

        ois.close();

        ois.close();
    }
}
