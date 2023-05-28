package io.pushbackstream;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class testinput {
    @Test
    public void test() throws IOException {
        PushbackInputStream pis=new PushbackInputStream(new ByteArrayInputStream("asdajkhdjkwhdajkw".getBytes()));

        int n;
        while ((n=pis.read())!=-1){
            System.out.println((char) n);
            if (n=='k'){
                pis.unread('I');
            }
        }
        pis.close();
    }
    @Test
    public void test1() throws IOException {
        PushbackInputStream pis=new PushbackInputStream(new ByteArrayInputStream("asdajkhdjkwhdajkw".getBytes()),3);

        int len;
        byte[] b=new byte[3];
        while ((len=pis.read(b))!=-1){
            String s = new String(b, 0, len);
            System.out.println(s);
            //
            if (s.equals("ajk")){
                pis.unread(new byte[]{'Q','W','E'});
            }
        }
        pis.close();
    }
}
