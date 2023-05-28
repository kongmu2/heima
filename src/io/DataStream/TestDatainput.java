package io.DataStream;

import org.junit.Test;

import java.io.*;

public class TestDatainput {


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
            System.out.println("读取成功");
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
