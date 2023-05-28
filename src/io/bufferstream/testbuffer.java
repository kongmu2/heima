package io.bufferstream;

import org.junit.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class testbuffer {
    @Test
    public void test()throws IOException {
        FileWriter fileWriter = new FileWriter("src/io/bufferstream/a.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("ojdasd大苏dasdj1dsadsdasdSD卡记录卡");
        bufferedWriter.close();

    }
}
