package io.readerwriter.streamtoreader;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class testStreamreader {
    @Test
    public void test1()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("src/io/readerwriter/streamtoreader/text.txt")));
        String line;
        while ((line=reader.readLine())!=null){
            System.out.println(line);
        };
        reader.close();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line=reader.readLine())!=null){
            System.out.println(line);
        }
        reader.close();
    }
    @Test
    public void test()throws IOException{
        Scanner scanner = new Scanner(new FileInputStream("src/io/readerwriter/streamtoreader/text.txt"));
        String s=scanner.nextLine();
        System.out.println(s);
    }
}
