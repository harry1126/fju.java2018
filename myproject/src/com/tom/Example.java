package com.tom;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("Please enter total ticket: "+number);
		int roundTicket= scanner.nextInt();
		System.out.println("How many roundTicket: "+roundTicket);
		Ticket ticket = new Ticket(number, roundTicket,1000);
		System.out.println("Total: "+ticket.total());
		
	}

}
