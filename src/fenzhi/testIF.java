package fenzhi;

import java.util.Scanner;

public class testIF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入音乐成绩：");
        int music = sc.nextInt();
        System.out.println("请输入java成绩：");
        int java =sc.nextInt();
        if (java>88&&music>78){
            System.out.println("666");
        }
    }
}
