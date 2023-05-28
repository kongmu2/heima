package io.readerwriter;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class testwriter {
    @Test
    public void test()throws IOException {
        String s="hello world";
        FileWriter fileWriter = new FileWriter("src/io/readerwriter/text.txt");
        fileWriter.write(s);
        fileWriter.close();


    }
}
