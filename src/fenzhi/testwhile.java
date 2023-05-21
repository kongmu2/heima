package fenzhi;

import org.junit.Test;

import java.util.Scanner;

public class testwhile {
    @Test
    public void testwhile(){
        Scanner sc=new Scanner(System.in);

        while (true) {
            System.out.println("请输入java成绩");
            int java=sc.nextInt();
            if(java==100){
                System.out.println("奖励哈维Mate 40 pro");
            }
            else if(java>=80&&java<=90){
                System.out.println("奖励switch");
            }else if(java>=70&&java<80){
                System.out.println("啥也没有");
            }else{
                System.out.println("啥也没有");
            }
        }
    }
}
