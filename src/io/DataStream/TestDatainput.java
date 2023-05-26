package io.DataStream;

import org.junit.Test;

import java.io.*;

public class TestDatainput {
    @Test
    public void test() throws IOException {
        DataOutputStream dos = null;
        try {
            dos= new DataOutputStream(new FileOutputStream("src/io/DataStream/test.txt"));
            dos.writeUTF("杨泉城");
            dos.writeByte(123);
            dos.writeBoolean(true);
            dos.writeChar('V');
            dos.writeLong(155644);
            dos.writeChars("sdhaddhksaj");
            dos.writeDouble(11.5);
            System.out.println("写入成功");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if (dos!=null){
                    dos.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }


    @Test
    public void test1() throws IOException {
        DataInputStream dis = null;
        try {
            dis= new DataInputStream(new FileInputStream("src/io/DataStream/test.txt"));
            String info=dis.readUTF();
            boolean flag=dis.readBoolean();
            long time=dis.readLong();
            System.out.println(info);
            System.out.println(flag);
            System.out.println(time);
            System.out.println("写入成功");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if (dis!=null){
                    dis.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
