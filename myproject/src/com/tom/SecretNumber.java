package com.tom;

import java.util.Random;
import java.util.Scanner;

public class SecretNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number n;
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int secret = random.nextInt(10)+1;
		System.out.println(secret);
			int number = scanner.nextInt();
			n = new Number(secret,number);
			System.out.println("Your guess: "+number);	
			if(n.a()){
				System.out.println("lower");
			}else{
				if(n.b()){
					System.out.println("higher");
				}
			}if(n.c()){
				System.out.println("Great!");
				
			}
				
			}
			
		
}
