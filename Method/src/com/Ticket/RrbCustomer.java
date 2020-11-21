package com.Ticket;


public class RrbCustomer {
public static void main(String[] args) {
	Conductor c=new Conductor();
	Ticket t=c.issue();
	System.out.println(t.name);
	System.out.println(t.qty);
	
}
}
