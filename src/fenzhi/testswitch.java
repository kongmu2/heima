package fenzhi;

import org.junit.Test;

import java.util.Scanner;

public class testswitch {
    @Test
    public void testswitch(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入分数");
        int score=sc.nextInt();
        switch (score/10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                break;
        }
    }
}
