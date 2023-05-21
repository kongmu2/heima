package io;

import java.io.*;

public class transferstream {
    public static void main(String[] args) throws Exception{

            BufferedReader in=new BufferedReader(new FileReader("src//transferstream.txt"));
            String str=in.readLine();
            System.out.println(str);
        //字符输入转换流
        InputStream is=new FileInputStream("src//transferstream.txt");

        Reader isr=new InputStreamReader(is,"GBK");

        BufferedReader bis=new BufferedReader(isr);
        String line;
        while ((line=bis.readLine())!=null){
            System.out.println(line);
        }
        bis.close();

        //字符输出转换流
        OutputStream os=new FileOutputStream("src//transferstream.txt");

        Writer osw=new OutputStreamWriter(os,"UTF-8");

        BufferedWriter bw=new BufferedWriter(osw);
        bw.write("塞尔达公主");
        bw.write("林克");
        bw.close();
    }
}
