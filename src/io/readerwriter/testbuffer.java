package io.readerwriter;

import org.junit.Test;

import java.io.*;

public class testbuffer {
    @Test
    public void test()throws IOException {
        FileWriter fileWriter = new FileWriter("src/io/readerwriter/b.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("ojdasd大苏dasdj1dsadsdasdSD卡记录卡");
        bufferedWriter.close();
        
    }
    @Test
    public void testread()throws IOException {
        FileReader fr = new FileReader("src/io/readerwriter/b.txt");
        BufferedReader br = new BufferedReader(fr);
        String  n;
        while ((n=br.readLine())!=null){
            System.out.println(n);
        }
        br.close();
    }
}
