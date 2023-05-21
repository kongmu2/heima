package io;

import java.io.*;

public class buffer {
    private static final String SRC="D://录制视频//两山论.mp4";
    private static final String FOR="D://视频//liangshan.mp4";
    public static void main(String[] args) throws Exception {
                copy();
                copy1();
                copy2();
                copy3();

    }
    //字节缓冲
    public static void copy(){
        long starttime=System.currentTimeMillis();
        try (
                InputStream is=new FileInputStream(SRC);
                OutputStream os=new FileOutputStream(FOR+"vido.avi");
        ){
            byte[] buffer=new byte[1024];
            int len;
            while ((len=is.read(buffer))!=-1){
                os.write(len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long endtime=System.currentTimeMillis();
        System.out.println("字节数组copy耗时"+(endtime-starttime)/1000+"s");
    }
    private static void copy1() {
        long starttime=System.currentTimeMillis();
        try (
                InputStream is=new FileInputStream(SRC);
                InputStream bis=new BufferedInputStream(is);
                OutputStream os=new FileOutputStream(FOR+"vido.avi");
                OutputStream bos=new BufferedOutputStream(os);
        ){
            byte[] buffer=new byte[1024];
            int len;
            while ((len=bis.read(buffer))!=-1){
                bos.write(len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        long endtime=System.currentTimeMillis();
        System.out.println("缓冲字节数组copy耗时"+(endtime-starttime)/1000+"s");
    }

    private static void copy2() {

    }
    private static void copy3() {

    }

}
