package Array;

import java.util.Scanner;

public class arrayteacher {
    public static void main(String[] args) {
        int[] arr=new int[10];
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入10个年龄整数 用空格隔开");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            if(arr[i]>18){
                sum++;
            }
        }
        double a=(double)sum/10;
        double b=1-a;
        System.out.println("18岁以上的人数占比 %.2f"+ a);
        System.out.println("18岁以下的人数占比 %.2f"+ b);
    }
}
