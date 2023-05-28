package io.bytearraystream;

import org.junit.Test;

import java.io.*;

public class testarray {
    @Test
    public void test(){
        String s="dsjadjaw";
        byte[] b=s.getBytes();
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int n;
        while ((n=bis.read())!=-1){
            bos.write(n);
        }
        String r=new String(bos.toByteArray());
        System.out.println(r);
    }

    @Test
    public void test1()throws IOException {

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(bos);
        dos.writeInt(12);
        dos.writeDouble(123123);
        dos.writeUTF("我爱");
        dos.close();


        byte[] b=bos.toByteArray();
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        DataInputStream dis = new DataInputStream(bis);
        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());
        System.out.println(dis.readUTF());
        dis.close();
    }
}
