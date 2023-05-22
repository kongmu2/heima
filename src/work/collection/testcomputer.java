package work.collection;

import java.util.HashSet;
import java.util.Scanner;

public class testcomputer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Computer computer = new Computer(1, "小新", 128, 8, 5000);
        Computer computer1 = new Computer(2, "苹果", 256, 8, 6000);
        Computer computer2 = new Computer(3, "拯救者", 512, 16, 7000);
        HashSet<Computer> computers = new HashSet<>();
        computers.add(computer);
        computers.add(computer1);
        computers.add(computer2);
        for (Computer com : computers) {
            System.out.println("编号："+com.getId()+" 品牌："+com.getBrand()+" 硬盘："
                    +com.getHadsize()+" 内存:"+com.getMemsize()+" 价格"+com.getPrice());
        }

        System.out.println("请输入要查询的编号：");
        int a = sc.nextInt();

        for (Computer com1 : computers) {
            if(com1.getId()==a){
                computers.remove(com1);
                computers.add(new Computer(com1.getId(),"联想",com1.getHadsize(),com1.getMemsize(),com1.getPrice()));
                break;
            }
        }

        for (Computer com : computers) {
            System.out.println("编号："+com.getId()+" 品牌："+com.getBrand()+" 硬盘："
                    +com.getHadsize()+" 内存:"+com.getMemsize()+" 价格"+com.getPrice());
        }
    }
}
