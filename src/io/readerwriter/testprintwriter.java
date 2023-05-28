package io.readerwriter;

import org.junit.Test;

import java.io.IOException;
import java.io.PrintWriter;

public class testprintwriter {
    @Test
    public void test()throws IOException {
        PrintWriter printWriter = new PrintWriter("src/io/readerwriter/a.txt");
        printWriter.println("dskajdkwa");
        printWriter.printf("dhjkashdj%d第三代%.2f",12,3.2222);
        printWriter.close();
    }
}
