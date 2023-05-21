package io.commons;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class iocommons {
    public static void main(String[] args) throws Exception{
        IOUtils.copy(new FileInputStream("D:\\视频\\guimie.jpg"),new FileOutputStream("D:\\录制视频\\guimie.jpg"));

        FileUtils.deleteDirectory(new File("D:\\录制视频\\guimie.jpg"));

        FileUtils.copyDirectoryToDirectory(new File("D:\\视频\\guimie.jpg"),new File("D:\\录制视频\\guimie.jpg"));


    }
}
