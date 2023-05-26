package serializable.packge2;

import org.junit.Test;

import java.io.*;

public class SeriStudent implements Serializable {
        @Test
        public void test() throws IOException, ClassNotFoundException {
            Student student = new Student("杨泉城", 22);

            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("src/serializable/packge2/student1.txt"));
            oos.writeObject(student);
            oos.flush();
            oos.close();

            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("src/serializable/packge2/student1.txt"));
            Student stu =(Student) ois.readObject();
            System.out.println("stu = " + stu);

        }
}
