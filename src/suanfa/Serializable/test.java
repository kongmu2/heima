package suanfa.Serializable;

import java.io.*;

public class test {
    public static void serialize()throws IOException{
        Student student=new Student("kongmu",18,99);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("student.txt")));
        objectOutputStream.writeObject(student);
        objectOutputStream.close();
        System.out.println("序列化成功! 已经生成student.txt文件");
    }

    public static void deserialize() throws IOException,ClassNotFoundException{
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("student.txt")));
        Student student=(Student)objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("反序列化结果为");
        System.out.println(student);
    }



    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serialize();
        deserialize();
    }
}
