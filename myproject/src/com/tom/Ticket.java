package com.tom;

public class Ticket {
	int price;
	int number;
	int roundTicket;
	public Ticket(int number, int roundTicket, int price) {
		this.number = number;
		this.roundTicket = roundTicket;
		this.price  = price;
	}
	public float total() {
		return (number-roundTicket)*price+(int)(roundTicket*price*2*0.9f);  
		
	}
}
