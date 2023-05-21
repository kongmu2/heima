package io.Properties;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Properties;

public class properties {
    public static void main(String[] args) throws Exception{
        Properties properties=new Properties();
        properties.put("heima","1263712");
        properties.put("wangwu","28312");
        System.out.println(properties);
        properties.store(new FileOutputStream("src//io//Properties//keyvalue.txt"),"fuck you!");

        //向文件写入类
        properties.load(new FileReader("src//io//Properties//keyvalue.txt"));
        System.out.println(properties);
        String p1=properties.getProperty("heima");
        System.out.println(p1);
        String p2=properties.getProperty("wangwu");
        System.out.println(p2);



    }
}
