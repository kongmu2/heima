package io.readerwriter;

import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;

public class testReader {
    @Test
    public void test()throws IOException {
        FileReader fileReader = new FileReader("src/io/readerwriter/text.txt");
        int len;
        char[] c=new char[1024];
        while ((len=fileReader.read(c))!=-1){
            System.out.println(new String(c,0,len));
        }
        fileReader.close();
    }
}
