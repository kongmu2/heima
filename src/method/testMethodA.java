package method;

import java.util.Scanner;

public class testMethodA {
    public static void main(String[] args) {
        VariableParam v = new VariableParam();
        MethodA a=new MethodA();
        Scanner sc=new Scanner(System.in);
        double add=a.add(1.5,5.4,5.5);
        System.out.println(add);
        double avg=a.avg(1.8,54,68);
        System.out.println(avg);
//        System.out.println("请输入一个数");
//        double a1=sc.nextDouble();
//        System.out.println("请输入另一个数");
//        double a2=sc.nextDouble();
//        double max=a.max(a1,a2);
//        System.out.println("最大值"+max);
        System.out.println(v.sum(1,2,3,4));
    }
}
