package io.randomaccessfile;

import org.junit.Test;

import java.io.IOException;
import java.io.RandomAccessFile;

public class testrandom {
    @Test
    public void testwrite()throws IOException{
        RandomAccessFile raf = new RandomAccessFile("src/io/randomaccessfile/text.txt", "rw");
        raf.write("helloworld".getBytes());
        raf.close();
    }
    @Test
    public void testwrite2()throws IOException{
        //写到指定位置
        RandomAccessFile raf = new RandomAccessFile("src/io/randomaccessfile/text.txt", "rw");
        raf.seek(20);
        raf.write("yqc".getBytes());
        raf.close();
    }

    @Test
    public void testread()throws IOException{
        RandomAccessFile raf = new RandomAccessFile("src/io/randomaccessfile/text.txt", "rw");
        raf.seek(20);
        int len;
        byte[] b = new byte[1024];
        while ((len=raf.read(b))!=-1){
            System.out.println(new String(b,0,len));
        }
        raf.close();
    }

    @Test
    public void test()throws IOException{
        RandomAccessFile raf = new RandomAccessFile("src/io/randomaccessfile/text.txt", "rw");
        raf.writeInt(20);
        raf.writeChars("dasdw");
        raf.writeUTF("第三季");
        raf.close();
    }

    @Test
    public void test2()throws IOException{
        RandomAccessFile raf1 = new RandomAccessFile("src/io/randomaccessfile/text.txt", "rw");
        System.out.println(raf1.readUTF());
        System.out.println(raf1.readInt());
        System.out.println(raf1.readChar());
        raf1.close();
    }

    @Test
    public void testrandmoaccessfile() throws IOException {
        RandomAccessFile raf = new RandomAccessFile("text.txt", "rw");
        raf.seek(raf.length());


        RandomAccessFile file = new RandomAccessFile("test.txt", "rw");
        file.writeBoolean(true);
        file.writeInt(123456);
        file.writeInt(7890);
        file.writeLong(10000000);
        file.writeInt(777);
        file.writeFloat(0.0001f);
        file.seek(5);
        System.out.println(file.readInt());
        file.close();

    }
}
