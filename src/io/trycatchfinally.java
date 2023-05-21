package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class trycatchfinally {
    public static void main(String[] args) {
        try (
                InputStream in = new FileInputStream("D://录制视频//两山论.mp4");

                OutputStream out = new FileOutputStream("D://视频//liangshan.mp4");
                ){


            byte[] buffers=new byte[1024];
            int len;
            while ((len=in.read(buffers))!=-1){
                out.write(buffers,0,len);
            }
            System.out.println("拷贝完成");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("------现执行------");
        }
    }
}
