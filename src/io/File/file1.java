package io.File;

import org.junit.Test;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class file1 {
    @Test
    public void test1(){
        File rootfile = new File("d:/IDEAcode");
        File file = new File("src/io/File");
        File file1 = new File(rootfile, "test.txt");
        System.out.println("file.isDirectory() = " + file.isDirectory());
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        System.out.println("file.getTotalSpace() = " + file.getTotalSpace());
        System.out.println("file.getFreeSpace() = " + file.getFreeSpace());
        System.out.println("file.getUsableSpace() = " + file.getUsableSpace());

        System.out.println("file1.exists() = " + file1.exists());
    }
    
    @Test
    public void testforeach(){
        File file = new File("src/io");

        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.getName().endsWith(".txt")){
                System.out.println(file1);
            }
        }

        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }
        });
        System.out.println("Arrays.asList(list) = " + Arrays.asList(list));

        File[] lists = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });
        System.out.println("Arrays.asList(list) = " + Arrays.asList(lists));

        //列出可用的文件系统根
        File[] roots = File.listRoots();
        System.out.println(Arrays.asList(roots));
    }
    
    @Test
    public void testfor(){
        File file = new File("src/io");
        if (file.exists()){
            if (file.isDirectory()){
                System.out.println(file.getName()+"是文件夹");
                File[] files = file.listFiles();
                for (File file1 : files) {
                    System.out.println(file1.getAbsolutePath());
                }

            }else {
                System.out.println("\t"+file.getName());
            }
        }else {
            System.out.println("文件路径不存在");
        }
    }

    @Test
    public void testfis() throws IOException {
        //获取控制台输入的内容并写入文件中
        File file = new File("src/io/text.txt");

        FileOutputStream fileOutputStream = new FileOutputStream(file, true);

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入");
            String str=sc.next();
            if (str.equals("end")){
                System.out.println("退出");
                break;
            }
            str+="\r";
            byte b[]=str.getBytes();
            fileOutputStream.write(b);
        }
        fileOutputStream.close();
    }

    @Test
    public void testjpg() throws IOException {
        File file = new File("D:/视频/guimie.jpg");
        File file1 = new File("D:/视频/1.jpg");
        if (file.exists()) {
            FileInputStream fis = new FileInputStream(file);
            FileOutputStream fos = new FileOutputStream(file1);

            byte[] b=new byte[1024];
            int length=fis.read(b);

            while (length!=-1){
                fos.write(b,0,length);
                length=fis.read(b);
            }

            //流关闭原则后打开的先关闭
            fos.close();
            fis.close();
        }else {
            System.out.println("没有找到文件");
        }
    }
    
    @Test
    public void testnamefilter(){
        File file = new File("src/io");

        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".java");
            }
        });

        for (String s : list) {
            System.out.println(s);
        }

    }

    @Test
    public void testdelete(){
        File file = new File("D:/新建文件夹/test");
        deletByfile(file);
    }
    public static void deletByfile(File file){
        if(!file.exists()) {
            System.out.println("目录不存在");
            return;
        }

        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()){
                deletByfile(file1);
            }else{
                if(file1.delete()){
                    System.out.println(file.getPath()+"删除成功");
                }else {
                    System.out.println(file.getPath()+"删除失败");
                }
            }
        }
    }

    @Test
    public void testcreate(){
        File file1 = new File("E:/java");
        File file = new File("D:/102班级/javaSE作业");
        if(file.mkdirs()) {
            System.out.println("创建目录成功");
        }else{
            System.out.println("创建目录失败");
        }

        if (file1.mkdir()){
            System.out.println("创建目录成功");
        }else {
            System.out.println("创建目录失败");
        }
    }
    
    @Test
    public void testrandmoaccessfile() throws IOException {
        RandomAccessFile raf = new RandomAccessFile("text.txt", "rw");
        raf.seek(raf.length());


        RandomAccessFile file = new RandomAccessFile("test.txt", "rw");
        file.writeBoolean(true);
        file.writeInt(123456);
        file.writeInt(7890);
        file.writeLong(10000000);
        file.writeInt(777);
        file.writeFloat(0.0001f);
        file.seek(5);
        System.out.println(file.readInt());
        file.close();

    }


}
