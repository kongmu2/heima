package wrapper;

import org.junit.Test;

public class Testwrapper {
    @Test
    public void test1(){
        String conut="10";
        int i=Integer.parseInt(conut);
        System.out.println(i);
    }
    @Test
    public void test2(){
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
    }
    @Test
    public void test3(){
        Integer integer = new Integer("111");
        System.out.println("integer = " + integer);
        Integer integer1 = new Integer(42);
        System.out.println("integer1 = " + integer1);

    }
    @Test
    public void test4(){
        //parseXxx(str)将字符串转成基本数据类型
        String s="100";
        System.out.println("Integer.parseInt(s) = " + Integer.parseInt(s));
        System.out.println("Byte.parseByte(s) = " + Byte.parseByte(s));
        System.out.println("Short.parseShort(s) = " + Short.parseShort(s));
        System.out.println("Long.parseLong(s) = " + Long.parseLong(s));
        System.out.println("Double.parseDouble(s) = " + Double.parseDouble(s));
        System.out.println("Float.parseFloat(s) = " + Float.parseFloat(s));
    }
    
    @Test
    public void testCharacter(){
        String s="sdSAw213 jahd  sJSdj" ;
        char[] chars=s.toCharArray();
        int letters=0;
        int digits=0;
        int whites=0;
        int uppers=0;
        int lowers=0;
        for (char aChar : chars) {
            if (Character.isLetter(aChar)){
                letters++;
            }if (Character.isDigit(aChar)){
                digits++;
            }if (Character.isWhitespace(aChar)){
                whites++;
            }if (Character.isUpperCase(aChar)){
                uppers++;
            }if (Character.isLowerCase(aChar)){
                lowers++;
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("whites = " + whites);
        System.out.println("uppers = " + uppers);
        System.out.println("lowers = " + lowers);
    }
    @Test
    public void testsd(){
        Integer integer=new Integer(100);//装箱
        System.out.println("integer = " + integer);
        int i = integer.intValue();//拆箱
        System.out.println("i = " + i);
        //自动装箱

        Integer integer1=200;
        Integer integer2=200;
        System.out.println("integer1 = " + integer1);
        int a=integer1;
        System.out.println("a = " + a);
    }
    @Test
    public void test(){
        Integer int1=100;
        Integer int2=100;
        System.out.println("int1=int2 = " + (int1==int2));

        Integer int3=1880;
        Integer int4=1880;
        System.out.println("int3==int4 = " + (int3 == int4));
    }
}
