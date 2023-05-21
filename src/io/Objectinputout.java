package io;

import java.io.*;

public class Objectinputout {
    public static void main(String[] args) throws Exception{
        Student s1=new Student("张浩","wnagsdhw","widjaisj",12);
        OutputStream out=new FileOutputStream("src//writerout.txt");
        //对象字节输出流包装管道
        ObjectOutputStream oout=new ObjectOutputStream(out);
        //调用对象字节输出流方法
        oout.writeObject(s1);
        oout.close();


        //对象字节输入流
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("src//writerout.txt"));

        Object s=in.readObject();

        System.out.println(s);


    }
}
class Student implements Serializable {
    public static final long serialVersionUID=1;
    private String name;
    private String loginName;
    private transient String password;
    private int age;

    public Student() {
    }

    public Student(String name, String loginName, String password, int age) {
        this.name = name;
        this.loginName = loginName;
        this.password = password;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}