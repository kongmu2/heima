package work;

import java.util.Scanner;

public class register {
    public static void main(String[] args) {
        boolean flag=false;
        Scanner sc=new Scanner(System.in);
        while (flag==false) {
            System.out.println("请输入用户名:");
            String username=sc.nextLine();
            System.out.println("请输入密码:");
            String pwd=sc.nextLine();
            System.out.println("请输入确定密码:");
            String confpwd=sc.nextLine();
            if (username.length()>3){
                if(pwd.length()>6){
                    if (pwd.equals(confpwd)){
                        flag=true;
                        System.out.println("注册成功");
                        break;
                    }else{
                        System.out.println("注册失败两次输入密码不同");
                        continue;
                    }
                }else {
                    System.out.println("注册失败密码长度小于6");
                    continue;
                }
            }else {
                System.out.println("注册失败用户名长度小于3");
                continue;
            }
        }
    }
}
