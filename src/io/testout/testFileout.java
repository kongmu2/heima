package io.testout;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class testFileout {
    @Test
    public void test()throws IOException {
        File file = new File("src/io/testout/a.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream(file,true);
        fos.write("的话但是".getBytes(),3,9);//中文在unicode中占三个字节
        fos.close();
    }
}
