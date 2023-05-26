package io.File;

import org.junit.Test;

import java.io.*;

public class lisetjava {
    @Test
    public void test() throws IOException {
        File file = new File("src/io");
        DataOutputStream fos = new DataOutputStream(new FileOutputStream("D:/temp.txt"));


        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".java");
            }
        });

        for (File file1 : files) {
            fos.writeUTF(file1.getAbsolutePath());
            fos.writeChars("\n");
        }

        fos.close();
        System.out.println("输入完成");

    }
}
