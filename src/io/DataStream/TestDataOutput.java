package io.DataStream;

import org.junit.Test;

import java.io.*;

public class TestDataOutput {
    @Test
    public void test() throws IOException {
        DataOutputStream dos = null;
        try {
            dos= new DataOutputStream(new FileOutputStream("src/io/DataStream/test.txt",true));
            dos.writeUTF("杨泉城");
            dos.writeUTF("杨泉城2");
            dos.writeInt(123);
            dos.writeBoolean(true);
            dos.writeChar('V');
            dos.writeLong(155644);
            dos.writeChars("sdhaddhksaj");
            dos.writeDouble(11.5);
            System.out.println("写入成功");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if (dos!=null){
                    dos.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
