package work;

import java.util.Random;
import java.util.Scanner;

public class GuessArray {
    public static void main(String[] args) {
            guess();
    }
    public static void guess(){
        Random r=new Random();
        int a = r.nextInt(50)+1;
        System.out.println("请输入所猜的数字");
        Scanner sc=new Scanner(System.in);

        boolean flag=false;
        while (flag==false){
            int i = sc.nextInt();
            if (i==a){
                flag=true;
            }
            if (i>a){
                System.out.println("猜大了");
            }else if(i<a){
                System.out.println("猜小了");
            }
        }
        if (flag==true){
            System.out.println("找到了数字");
        }else {
            System.out.println("未找到数字");
        }
    }
}
