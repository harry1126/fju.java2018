package com.tom;

import java.util.Random;
import java.util.Scanner;

public class SecretNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int secret = random.nextInt(10)+1;
		System.out.println(secret);
		int number = scanner.nextInt();
		System.out.println("Your guess: "+number);
		if(number>secret) {
			System.out.println("lower");
		}else{
			if(number==secret){
				System.out.println("higher");
			}else{
				System.out.println("Great! The secret number is "+secret);
			}
				
		}
		 
		
	}

}
