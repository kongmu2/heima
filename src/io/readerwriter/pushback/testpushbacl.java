package io.readerwriter.pushback;

import org.junit.Test;

import java.io.CharArrayReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class testpushbacl {
    @Test
    public void testreader()throws IOException {
        PushbackReader reader = new PushbackReader(new CharArrayReader("asjdawjkbdjkabjkawj".toCharArray()),3);
        char[] b=new char[3];
        int len;
        while ((len=reader.read(b))!=-1){
            String s = new String(b, 0, len);
            System.out.println(s);
            if (s.equals("jkb")){
                reader.unread(new char[]{'G','G','G'});
            }
        }
        reader.close();
    }
}
