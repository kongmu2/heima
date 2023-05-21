package com.buyticket;

public class Test {
    public static void main(String[] args) {
        Admin admin = new Admin();
        Ticket ticket1 = new Ticket("sda", 56);
        Ticket ticket2 = new Ticket("yqc", 89);

        User user1 = new User("杨泉城", "男");
        User user2 = new User("胀痛哈", "男");

        admin.open(ticket1);
        admin.close(ticket2);

        Ticket[] tickets=new Ticket[]{ticket1,ticket2};

        user1.buyticket(tickets);
        user1.show();

    }
}
