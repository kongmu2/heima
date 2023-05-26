package io;

import java.io.*;

public class FileReaderdemo {
    public static void main(String[] args) throws Exception{
        //文件字符输入流
        Reader in=new FileReader("src\\word.txt");
//        int code=in.read();
//        System.out.println(code);


        //连续读单个字符
//        int code;
//        while ((code=in.read())!=-1){
//            System.out.print((char) code);
//        }

        //读字符数组
        char[] chars=new char[1024];
        int len;
        while ((len=in.read(chars))!=-1){
            String str=new String(chars,0,len);
            System.out.print(str);
        }

        //文件字符输出流
        Writer out=new FileWriter("src//writerout.txt",true);

        out.write(90);
        out.write('王');
        out.write("\r\n");
        char[] chars1="塞尔达传说".toCharArray();
        out.write(chars1);
        out.write("\r\n");
        out.write("adnjs王华");
        out.write("\r\n");
        out.write("123间谍过家家",3,5);
        out.write("\r\n");
        out.flush();//刷新后流仍可使用
        out.close();//关闭含刷新，关闭后不可使用流

    }



}
