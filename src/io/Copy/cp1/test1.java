package io.Copy.cp1;

import org.junit.Test;

import java.io.*;

public class test1 {
    @Test
    public void test() throws IOException {
        File file1 = new File("src/word.txt");
        File file2 = new File("src/word1.txt");
        InputStream is = new FileInputStream(file1);
        InputStreamReader isr = new InputStreamReader(is,"UTF-8");
        BufferedReader br = new BufferedReader(isr);

        FileWriter fw = new FileWriter(file2);
        BufferedWriter bw = new BufferedWriter(fw);

        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
        }



        br.close();
        isr.close();
        is.close();

        bw.close();
        fw.close();
    }
}
