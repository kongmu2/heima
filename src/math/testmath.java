package math;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

public class testmath {
    @Test
    public void test1(){
        double a=-3.234;
        System.out.println(Math.abs(a));
        System.out.println(Math.ceil(a));
        System.out.println(Math.floor(a));
        System.out.println(Math.round(a));
        System.out.println(Math.random()*3);
        System.out.println(Math.cbrt(a));
        System.out.println(Math.sin(a));
    }

    @Test
    public void testBiginteger(){
        BigInteger bigInteger1 = new BigInteger("43243432123132143142132132");
        BigInteger bigInteger2 = new BigInteger("1231321431414535124132132");
        System.out.println(bigInteger1.add(bigInteger2));//加
        System.out.println(bigInteger1.subtract(bigInteger2));//减
        System.out.println(bigInteger1.multiply(bigInteger2));//乘
        System.out.println(bigInteger1.divide(bigInteger2));//除
    }
    
    @Test
    public void testBigdeciml(){
        BigDecimal b1 = new BigDecimal("4.123");
        BigDecimal b2 = new BigDecimal("2.43");
        System.out.println(b1.add(b2));
        System.out.println(b1.subtract(b2));
        System.out.println(b1.multiply(b2));
        System.out.println(b1.divide(b2,4));
    }

    @Test
    public void testrandom(){
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            System.out.println(random.nextInt());
        }

        int a = random.nextInt(4);

    }

    @Test
    public void testRandomyoucan(){
        Random random = new Random(10);
        System.out.println(random.nextInt());
    }
    
    @Test
    public void testrandom1(){
        Random random = new Random();
        int a1 = random.nextInt(4);
        for (int i = 0; i < 6; i++) {
            System.out.println(a1);
        }
    }

    @Test
    public void testyanzhengma(){
        String s="dsajdklwj417632713djnsajkfdjaknkbgbkjhnekjrklfngmskdfh";
        char[] chars=s.toCharArray();
        Random random = new Random();
        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < 8; i++) {
            buffer.append(chars[random.nextInt(chars.length)]);
        }
        
        System.out.println(buffer);
    }
}
