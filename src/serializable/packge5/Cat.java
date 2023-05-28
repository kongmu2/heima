package serializable.packge5;

import java.io.*;

public class Cat implements Serializable {
    @Serial
    private static final long serialVersionUID = -1320455330026504635L;
    private String name;
    private int age;
    private String addr;

    //自定义序列化方法
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeUTF(addr+"地址");
    }
    //自定义反序列化方法
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        addr=in.readUTF();
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Cat(String name, int age, String addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }
}
