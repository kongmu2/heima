package work;

import java.util.Scanner;


public class jinzita {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要打印的层数");
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
