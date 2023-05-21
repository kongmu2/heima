package stringBuffer;

import org.junit.Test;

public class testBuffer {
    @Test
    public void test(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("hh");
        stringBuffer.append("yy");
        System.out.println(stringBuffer.toString());
    }

    @Test
    public void testbuilder(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("jdhsad");
        stringBuilder.append("gdsuad");
        System.out.println(stringBuilder.toString());
    }
    
    @Test
    public void testopt(){
        StringBuffer buffer = new StringBuffer("hello");
        buffer.append("hsdja");
        buffer.append("hsxjmkaa");
        buffer.insert(2,"XX");
        System.out.println(buffer.toString());
        buffer.delete(0,2);
        System.out.println(buffer.toString());
        buffer.deleteCharAt(6);
        System.out.println(buffer.toString());
        buffer.replace(0,2,"TT");
        System.out.println(buffer.toString());
        buffer.reverse();
        System.out.println(buffer.toString());
    }
    
}
