package fenzhi;

import org.junit.Test;

import java.util.Scanner;

public class qiantao {
    @Test
    public void testqiantao(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入是否是会员");
        int vip=sc.nextInt();
        System.out.println("请输入购物金额");
        double money = sc.nextDouble();
        if(vip==0){
            if (money>=200){
                System.out.println("会员支付"+(money*0.75));
            }else {
                System.out.println("会员支付"+(money*0.8));
            }
        }else {
            if (money>=100){
                System.out.println("非会员支付"+(money*0.9));
            }else {
                System.out.println("非会员支付");
            }
        }
    }
}
