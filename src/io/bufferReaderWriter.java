package io;

import java.io.*;

public class bufferReaderWriter {
    public static void main(String[] args){
        try (
                Reader in=new FileReader("D://IDEAcode//heima//src//word.txt");
                BufferedReader bin=new BufferedReader(in);
                ){
//            char[] chars=new char[1024];
//            int len;
//            while ((len=in.read(chars))!=-1){
//                String str=new String(chars,0,len);
//                System.out.print(str);
//            }
            String line;
            while ((line=bin.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(
                Writer out=new FileWriter("src//writerout.txt",true);
                BufferedWriter bout=new BufferedWriter(out);
                ) {
            bout.write(100);
            bout.write('李');
            bout.newLine();
            char[] chars1="塞尔达传说2222".toCharArray();
            bout.write(chars1);
            bout.newLine();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
