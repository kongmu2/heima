package io;

import java.io.*;
import java.util.Scanner;
public class io {
    public static void main(String[] args) throws IOException{
        File f=new File("D://file//word.txt");
        File f1=new File("src//hello.java");


        f.mkdirs();
        f1.mkdirs();
        System.out.println(f.mkdirs());
        System.out.println(f);
        System.out.println(f1);
        System.out.println(f.exists()+"存在"+f.getName());
        System.out.println(f1.exists()+"存在"+f1.getName());

//        check(f);
//        check(f1);

        System.out.println(f.canRead()+" "+f.getName());
        System.out.println(f1.canRead()+" "+f1.getName());




        //字节型写数据
        File FL=new File("D://file//ja.txt");
        OutputStream out=new FileOutputStream(FL);
        byte by[]="我的世界".getBytes();
        out.write(by);
        out.close();
        //字节型读数据
        InputStream se=new FileInputStream(FL);
        byte byt[]=new byte[1024];
        int len=se.read(byt);
        System.out.println("输出信息:"+new String(byt,0,len));
        se.close();

        //字符型写数据
        File FL1=new File("D://file//java.txt");
        FileWriter w=new FileWriter(FL1);
        String word="塞尔达";
        w.write(word);
        w.close();
        //字符型读数据
        FileReader r=new FileReader(FL1);
        char ch[]=new char[1024];
        int len1=r.read(ch);
        System.out.println("输出结果:"+new String(ch,0,len1));
        r.close();






//        System.out.println(f.delete()+"删除成功"+f.getName());
//        System.out.println(f1.delete()+"删除成功"+f1.getName());
//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入要查找的文件的目录");
//        String path=sc.next();
//        System.out.println("请输入要查找的文件的目录");
//        String name=sc.next();
//        File pat=File(path);
//        searchFile(path,name);
    }
//    public static void check(File e){
//        if (e.isDirectory())
//            System.out.println("是目录");
//        else if(e.isFile())
//            System.out.println("是文件");
//    }
//    public static void searchFile(File e,String name){
//        if (e!=null&&e.isDirectory()){
//            File[] files=e.listFiles();
//            if (files!=null && files.length>0){
//                for (File file : files) {
//                    if (file.isFile()){
//                        if (file.getName().contains(name)){
//                            System.out.println("找到了"+file.getAbsolutePath());
//                        }
//                    }
//                }
//            }
//        }else {
//            System.out.println("没有此路径");
//        }
//    }
}
