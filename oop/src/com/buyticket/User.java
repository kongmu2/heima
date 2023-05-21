package com.buyticket;

public class User {
    private String name;
    private String sex;
    private Ticket[] tickets;

    public User() {
    }

    public User(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public void buyticket(Ticket[] tickets){
        Ticket[] Test=new Ticket[2];
        int j=0;
        for (Ticket ticket : tickets) {
             if (ticket.isState()){
                 Test[j]=ticket;
                 j++;
             }
             if (j>1){
                 break;
             }
        }
        this.tickets=Test;
    }
    public void show(){
        for (Ticket ticket : tickets) {
            if (ticket!=null){
                System.out.println(name+","+sex+","+ticket.getId()+","+ticket.getPrice());
            }else {
                System.out.println("本车次未开放");
            }
        }
    }
}
