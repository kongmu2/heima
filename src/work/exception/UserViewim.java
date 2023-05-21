package work.exception;

import java.util.Scanner;

public class UserViewim implements UserView{
    public static Scanner sc=new Scanner(System.in);
    public static UserBizim userBizim=new UserBizim();

    @Override
    public void login(){
            System.out.println("请输入用户名:");
            String username = sc.next();
            System.out.println("请输入密码:");
            String password = sc.next();

        try {
            userBizim.login(username,password);
            System.out.println("登录成功");
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void register(){

        System.out.println("请输入用户名");
        String username = sc.next();
        System.out.println("请输入密码");
        String password=sc.next();
        System.out.println("请输入确认密码");
        String confpwd = sc.next();
        System.out.println("请输入姓名");
        String name=sc.next();
        System.out.println("请输入邮箱");
        String email=sc.next();
        try {
            userBizim.register(username,password,confpwd,name,email);

            System.out.println("注册成功");
        } catch (RegisterException e) {
            e.printStackTrace();
        }


    }

    public void start() throws LoginException, RegisterException {
        while (true){
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("请输入编号");
            int i = sc.nextInt();
            switch (i){
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
            }
        }
    }
}
