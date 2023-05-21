package fenzhi;

import org.junit.Test;

import java.util.Scanner;

public class season {
    @Test
    public void testswitch(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入春夏秋冬");
        String s=sc.next();
        switch (s) {
            case "春":
                System.out.println("A");
                break;
            case "夏":
                System.out.println("B");
                break;
            case "秋":
                System.out.println("C");
                break;
            case "冬":
                System.out.println("D");
                break;
            default:
                break;
        }
    }
}
