package io.PrintStream;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class test {
    public static void main(String[] args) throws Exception{

//        PrintStream out=new PrintStream("src//io//PrintStream//printstream.txt","UTF-8");
        //打印流不能追加数据，要追加数据就要用低级流嵌套。
        PrintStream out=new PrintStream(new FileOutputStream("src//io//PrintStream//printstream.txt",true));
        out.print("sss");
        out.print(123);
        out.print("swdas");
        out.print('我');
        PrintWriter wo=new PrintWriter("src//io//PrintStream//printstream.txt","UTF-8");
        wo.print("wonderful");

        out.flush();
        out.close();
    }
}
