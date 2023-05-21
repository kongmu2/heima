package fenzhi;

import org.junit.Test;

import java.util.Scanner;

public class sanyuan {
    @Test
    public void testsanyuan(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数a");
        int a=sc.nextInt();
        System.out.println("请输入一个数b");
        int b=sc.nextInt();
        int Max=a>b?a:b;
        System.out.println(Max);
    }
}
