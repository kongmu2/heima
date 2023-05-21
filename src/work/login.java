package work;

import org.junit.Test;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        String name="admin";
        String pwd="12345";
        int flag=0;
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请输入用户名：");
            String username=sc.nextLine();
            System.out.println("请输入密码：");
            String password=sc.nextLine();
            if (username.equals(name)&&password.equals(pwd)){
                System.out.println("登录成功");
                break;
            }else if(username.equals(name)&&password!=pwd){
                flag++;
                System.out.println("密码错误");
            }else {
                flag++;
                System.out.println("账户或密码错误");
            }
            if (flag==3){
                System.out.println("密码错误超过3次，密码锁定");
                break;
            }
        }
    }
}
