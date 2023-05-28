package work.collection.gouwuche;

import java.util.Scanner;

public class testshopcat {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.showItems();
        menu();
        int a = sc.nextInt();
        switch (a){
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
        }



    }
    public static void menu(){
        System.out.println("1、添加");
        System.out.println("2、删除");
        System.out.println("3、修改");
        System.out.println("4、显示总价");
        System.out.println("请输入选项");
    }
}
