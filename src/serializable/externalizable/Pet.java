package serializable.externalizable;

import java.io.*;

public class Pet implements Externalizable{

    private String name;
    private int age;
    private String addr;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                '}';
    }

    public Pet() {
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

    public Pet(String name, int age, String addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name+"大姐姐卡");
        out.writeInt(age);
        out.writeUTF(addr+"地址");
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.name=in.readUTF();
        this.age=in.readInt();
        this.addr=in.readUTF();
    }
}
