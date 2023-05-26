package io.PrintStream;

import org.junit.Test;

import java.io.*;

public class test {
    @Test
    public void test()throws IOException {
        //        PrintStream out=new PrintStream("src//io//PrintStream//printstream.txt","UTF-8");
        //打印流不能追加数据，要追加数据就要用低级流嵌套。
        PrintStream out=new PrintStream(new FileOutputStream("src/io/PrintStream/printstream.txt",true));
        out.print("sss");
        out.print(123);
        out.print("swdas");
        out.print('我');
//        PrintWriter wo=new PrintWriter("src/io/PrintStream/printstream.txt","UTF-8");
//        wo.print("wonderful");



        out.flush();
        out.close();
    }
    @Test
    public void test1() throws FileNotFoundException {
        PrintStream pr = new PrintStream(new FileOutputStream("outfile"));
//        System.out = pr;
        System.out.println("OK!");

    }
}
