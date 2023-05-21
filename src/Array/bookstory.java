package Array;

import org.junit.Test;

import java.util.Scanner;

public class bookstory {
    @Test
    public void testbook(){
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("图书管理系统");
            System.out.println("1.图书列表");
            System.out.println("2.添加图书");
            System.out.println("3.修改图书");
            System.out.println("4.删除图书");
            System.out.println("0.退出系统");
            System.out.println("请输入功能");
            int i =sc.nextInt();
            switch (i) {
                case 1:
                    System.out.println("图书列表");
                    break;
                case 2:
                    System.out.println("添加图书");
                    break;
                case 3:
                    System.out.println("修改图书");
                    break;
                case 4:
                    System.out.println("删除图书");
                case 0:
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}
