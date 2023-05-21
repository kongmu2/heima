package Array;

import java.util.Random;
import java.util.Scanner;

public class GuessArray {
    public static void main(String[] args) {
//        boolean flag=false;
//        int[] arr={11,55,66,88,666,87};
//        Random r=new Random();
//        int pre=r.nextInt(10);
//        System.out.println("请输入所猜的数");
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]==a){
//                flag=true;
//            }
//        }
//        if (flag==true){
//            System.out.println("找到了");
//        }else {
//            System.out.println("未找到");
//        }
            guess();
    }
    public static void guess(){
        Random r=new Random();
        int a = r.nextInt(10);
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
            }else {
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
