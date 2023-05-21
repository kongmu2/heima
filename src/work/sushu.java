package work;

import java.util.Scanner;

public class sushu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int a = sc.nextInt();
        boolean flag=false;
        for (int i = 2; i <a ; i++) {
            if (a%i==0){
                flag=true;
            }
        }
        if (flag==false){
            System.out.println(a+"是素数");
        }else {
            System.out.println(a+"不是素数");
        }
    }
}
