package io.Copy.cp3;

import org.junit.Test;

import java.io.*;

public class copymp3 {
    @Test
    public void test() throws IOException {
        FileInputStream source = new FileInputStream("D:/src.mp3");
        FileOutputStream dest = new FileOutputStream("D:/des.mp3");

        BufferedInputStream bis = new BufferedInputStream(source);
        BufferedOutputStream bos = new BufferedOutputStream(dest);


        byte[] b=new byte[1024];
        int len;
        while ((len=bis.read(b))>0){
            bos.write(b,0,len);
        }



        bis.close();
        source.close();
        bos.close();
        dest.close();
    }
}
