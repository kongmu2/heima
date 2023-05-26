package io.Copy.cp2;

import java.io.*;

public class CopyAll {
    public static void main(String[] args) {
        String srcFolder = "D:/chenhao";
        String destFolder = "E:/zhangsan";

        File srcFile = new File(srcFolder);
        File destFile = new File(destFolder);

        if (srcFile.isDirectory()) {
            if (!destFile.exists()) {
                destFile.mkdirs();
            }

            String[] files = srcFile.list();
            for (String file : files) {
                File src = new File(srcFile, file);
                File dest = new File(destFile, file);
                try {
                    copy(src, dest);
                    System.out.println("成功复制文件：" + src.getAbsolutePath());
                } catch (IOException e) {
                    System.out.println("复制文件失败：" + src.getAbsolutePath() + "，错误信息：" + e.getMessage());
                }
            }

            System.out.println("文件夹复制完成。");
        } else {
            System.out.println("源路径不是一个文件夹。");
        }
    }

    public static void copy(File src, File dest) throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dest);

        byte[] buffer = new byte[1024];
        int length;
        while ((length = fis.read(buffer)) > 0) {
            fos.write(buffer, 0, length);
        }

        fis.close();
        fos.close();
    }
}