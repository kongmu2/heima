package com.buyticket;

public class Admin {
    public void open(Ticket ticket){
        ticket.setState(true);
    }
    public void close(Ticket ticket){
        ticket.setState(false);
    }
}
